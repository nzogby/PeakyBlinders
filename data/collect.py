import alpha_vantage
from alpha_vantage.timeseries import TimeSeries
import pprint
import json
import urllib, requests


### EXAMPLE DATA COLLECTION METHODS
class DataCollector:
	
	def get_json(self, url, filename):
		response = urllib.urlopen(url)
		data = json.loads(response.read())
		with open("data_files/" + filename + ".meta_data.json", "w") as f:
			json.dump(data, f)

	def json_symbols_request(self, url, symbols ):
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
	

### EXAMPLE BASIC DAILY MICROSOFT DATA EXTRACTION QUERY
	def example_1(self):
		url = {}
		url['demo1'] = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=demo"
		url['demo2'] = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&outputsize=full&apikey=demo"
		for item in url:
			self.get_json(url[item], item)

### EXAMPLE BASIC TIME SERIES CUSTOMIZED QUERY OF MULTIPLE STOCKS
	def example_2(self):
		API_URL = "https://www.alphavantage.co/query"
		symbols = ['QCOM', 'INTC', 'PDD']
		self.json_symbols_request(API_URL, symbols)
