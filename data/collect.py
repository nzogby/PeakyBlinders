import alpha_vantage
from alpha_vantage.timeseries import TimeSeries
import pprint
import json
import urllib, requests


### EXAMPLE DATA COLLECTION METHODS

### RETURNS JSON DATA FROM URL AS JSON OBJECT
def get_json(url, filename):
	response = urllib.urlopen(url)
	data = json.loads(response.read())
	with open("data_files/" + filename + ".meta_data.json", "w") as f:
		json.dump(data, f)

def json_symbols_request(url, symbols ):
	for symbol in symbols:
		data = { "function": "TIME_SERIES_INTRADAY",
			"symbol": symbol,
			"interval": "60min",
			"datatype": "json",
			"apikey": 'D1OG0BNI06KWU3FO',
		}
		response = requests.get(url, data)
		data = response.json()
		with open("data_files/" + symbol + "_ts_data.json", "w") as f:
			json.dump(data, f)
	


def method_1():
	url = {}
	url['demo1'] = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=demo"
	url['demo2'] = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&outputsize=full&apikey=demo"
	for item in url:
		get_json(url[item], item)


def method_2():
	API_URL = "https://www.alphavantage.co/query"
	symbols = ['QCOM', 'INTC', 'PDD']
	json_symbols_request(API_URL, symbols)
