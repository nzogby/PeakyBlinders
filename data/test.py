import unittest
import collect
import os.path

class DataCollectionTest(unittest.TestCase):
	
	### CHECKS FOR BASIC INSTANTIATION
	def test_1(self):
		test = collect.DataCollector()

	def test_2(self): #tests function example_2
		test = collect.DataCollector()	
		test.example_1()
		self.assertTrue(os.path.isfile("data_files/demo1.meta_data.json"))
		self.assertTrue(os.path.isfile("data_files/demo2.meta_data.json"))

	def test_3(self): # tests function example_1
		test = collect.DataCollector()
		test.example_2()
		output = True
		if not (os.path.isfile("data_files/QCOM_ts_data.json")):
			output = False
		elif not (os.path.isfile("data_files/INTC_ts_data.json")):
			output = False
		elif not (os.path.isfile("data_files/PDD_ts_data.json")):
			output = False
		self.assertTrue(output)
		
		
if __name__ == '__main__':
	unittest.main()
