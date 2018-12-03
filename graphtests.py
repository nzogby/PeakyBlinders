import unittest
import stockgraphs

import os

class TestCases(unittest.TestCase):
    
    def test_plotGraphOfStock(self):
        
        ticker = "TSLA"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))

    def test_plotGraphOfStock2(self):
        
        ticker = "FB"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))

if __name__ == '__main__':
    unittest.main()