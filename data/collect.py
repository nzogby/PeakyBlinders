import alpha_vantage
from alpha_vantage.timeseries import TimeSeries
import pprint
import json
import urllib, requests, ssl
from requests.packages.urllib3.exceptions import InsecureRequestWarning

### Data Collection ###

'''

    Data Collection is done by reading in a manifest file
    followed by making GET requests to source.

    Once data is scraped and stored, we then build out a file for each stock sector.
    These are all stored in data_files/types.

'''

### IMPORTANT FILE LOCATIONS/INFO ###

'''

Locations:

    STOCK JSONS: PeakyBlinders/data/data_files/storage
    STOCK TYPE JSONS: PeakyBlinders/data/data_files/types
    INDEX FILE: PeakyBlinders/data/data_files/

INFO:
    individual stock filename convention: <stock_name>_data.json
    stock type filename convention: <stock_type>.json

'''
class DataCollector:
    
        def __init__(self):
            with open("data_files/manifest.json", "r") as f:
                self.manifest = json.load(f)
            self.source_url = "https://api.iextrading.com/1.0/stock/"
            self.index = {}
            self.sectors = []
            self.stock_names = []
                
        def obtain_data(self):
            for stock in self.manifest['input_stocks']:
                self.json_symbol_request(stock)

	def json_symbol_request(self, symbol):
            print "scraping stock data for " + symbol + " ......."
            requests.packages.urllib3.disable_warnings(InsecureRequestWarning)
	    response = requests.get(self.source_url + symbol + "/batch?types=price,company", 
                    verify=False)
	    data = response.json()
            self.index[symbol] = data
            self.stock_names.append(symbol)
            print "success"

            if data['company']['sector'] not in self.sectors:
                self.sectors.append(data['company']['sector'])
            with open("data_files/storage/" + symbol + "_data.json", "w") as f:
		json.dump(data, f)

        def build_index_file(self):
            with open("data_files/index.json", "w") as f:
                json.dump(self.index, f)

        def build_sector_files(self):
            for sector in self.sectors:
                data = []
                for stock in self.index:
                    if self.index[stock]['company']['sector'] == sector:
                        data.append(self.index[stock])
                with open("data_files/types/" + sector.replace(" ", "_") + ".json", "w") as f:
                    json.dump(data, f)

        def print_state(self):
            print "DATA EXTRACTION COMPLETE, APPLICATION INFORMATION STATE: "
            for sector in self.sectors:
                print "...... SECTOR: " + sector + " ......"
                with open ("data_files/types/" + sector.replace(" ", "_") + ".json", "r") as f:
                    stocks = json.load(f)
                for stock in stocks:
                    print stock['company']['companyName']
            
