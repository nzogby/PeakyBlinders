import unittest
import collect
import json
import os.path

class DataCollectionTest(unittest.TestCase):
	
### CHECKS FOR BASIC INSTANTIATION
	def test_1(self):
		test = collect.DataCollector()
### BEGIN menu_bar UNIT TESTS ###

# this test runs the function which scrapes stock data, 
# then verifies that the data files exist.

        def test_2(self):
            test = collect.DataCollector()
            test.obtain_data

# checks to verify each stock scraped successfully

	def test_3(self):
	    test = collect.DataCollector()
            test.obtain_data()
            with open("data_files/manifest.json", "r") as f:
                symbols = json.load(f)
            test_result = True
            for symbol in symbols['input_stocks']:
                if not os.path.isfile("data_files/storage/" + symbol + "_data.json"):
                    test_result = False
            self.assertTrue(test_result)

# checks to see if index file is created during build

        def test_4(self):
            test = collect.DataCollector()
            test.obtain_data()
            test.build_index_file()
            self.assertTrue(os.path.isfile("data_files/index.json"))

        def test_5(self):
            test = collect.DataCollector()
            test.obtain_data()
            test.build_index_file()
            test.build_sector_files()
            test_result = True
            for sector in test.sectors:
                self.assertTrue(os.path.isfile("data_files/types/" + sector.replace(" ", "_") + ".json"))

### END menu_bar UNIT TESTS ###

if __name__ == '__main__':
	unittest.main()
