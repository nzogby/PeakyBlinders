import alpha_vantage
from alpha_vantage.timeseries import TimeSeries
import pprint
import json
import urllib, requests


### EXAMPLE DATA COLLECTION METHODS



url = {}
url['demo1'] = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=demo"
url['demo2'] = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&outputsize=full&apikey=demo"


for item in url:
	response = urllib.urlopen(url[item])
	data = json.loads(response.read())

	with open("data_files/" + item + ".meta_data.json", "w") as f:
		json.dump(data, f)

API_URL = "https://www.alphavantage.co/query"
symbols = ['QCOM', 'INTC', 'PDD']

for symbol in symbols:
	data = { "function": "TIME_SERIES_INTRADAY",
	"symbol": symbol,
	"interval": "60min",
	"datatype": "json",
	"apikey": 'D1OG0BNI06KWU3FO',
	}

	response = requests.get(API_URL, data)
	data = response.json()
	with open("data_files/ts_analysis.json", "w") as f:
		json.dump(data, f)
