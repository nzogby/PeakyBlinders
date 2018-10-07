import alpha_vantage
from alpha_vantage.timeseries import TimeSeries
import pprint
import json
import urllib, requests, ssl


### Data Collection ###

'''
    Data Collection is done by reading in a manifest file
        followed by making GET requests to source.

'''

class DataCollector:
    
        def __init__(self):
            with open("data_files/manifest.json", "r") as f:
                self.manifest = json.load(f)
            self.source_url = "https://api.iextrading.com/1.0/stock/"
            self.obtain_data()
                
        def obtain_data(self):
            for stock in self.manifest['input_stocks']:
                self.json_symbol_request(stock)

	def json_symbol_request(self, symbol):
            print self.source_url + symbol + "/"
	    response = requests.get(self.source_url + symbol + "/batch?types=price,company", 
                    verify=False)
	    data = response.json()
	    with open("data_files/storage/" + symbol + "_ts_data.json", "w") as f:
		json.dump(data, f)
