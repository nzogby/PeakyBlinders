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

	def test_3(self):
		test = collect.DataCollector()
                test.obtain_data()
                with open("data_files/manifest.json", "r") as f:
                    symbols = json.load(f)
                test_result = True
                for symbol in symbols['input_stocks']:
                    if not os.path.isfile("data_files/storage/" + symbol + "_ts_data.json"):
                        test_result = False
                self.assertTrue(test_result)
        def test_4(self):
            test = collect.DataCollector()
            test.obtain_data()
            test.build_index_file()
            self.assertTrue(os.path.isfile("data_files/index.json"))


### END menu_bar UNIT TESTS ###

if __name__ == '__main__':
	unittest.main()
