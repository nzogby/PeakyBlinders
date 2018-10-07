import unittest
import collect
import os.path

class DataCollectionTest(unittest.TestCase):
	
	### CHECKS FOR BASIC INSTANTIATION
	def test_1(self):
		test = collect.DataCollector()
### menu_bar unit tests... ###
	def test_2(self):
		test = collect.DataCollector()
                self.assertTrue(os.listdir("data_files/storage"))

if __name__ == '__main__':
	unittest.main()
