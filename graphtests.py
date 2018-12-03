import unittest
import stockgraphs

import os

class TestCases(unittest.TestCase):
    
    def test_plotGraphOfStock1(self):
        
        ticker = "TSLA"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))

    def test_plotGraphOfStock2(self):
        
        ticker = "FB"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock3(self):
        
        ticker = "ABBV"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))

    def test_plotGraphOfStock4(self):
        
        ticker = "ABT"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))

    def test_plotGraphOfStock5(self):
        
        ticker = "ADBE"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))

    def test_plotGraphOfStock6(self):
        
        ticker = "ADSK"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock7(self):
        
        ticker = "AET"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock8(self):
        
        ticker = "AKS"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock9(self):
        
        ticker = "ALL"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock10(self):
        
        ticker = "AMD"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock11(self):
        
        ticker = "AMRS"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock12(self):
        
        ticker = "AMZN"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock13(self):
        
        ticker = "AVY"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock14(self):
        
        ticker = "AXP"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock15(self):
        
        ticker = "CMCSA"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock16(self):
        
        ticker = "GOOG"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock17(self):
        
        ticker = "INTC"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock18(self):
        
        ticker = "JNJ"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock19(self):
        
        ticker = "MMM"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock20(self):
        
        ticker = "MSFT"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock21(self):
        
        ticker = "MU"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock22(self):
        
        ticker = "SNAP"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock23(self):
        
        ticker = "WMT"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
    def test_plotGraphOfStock24(self):
        
        ticker = "XOM"
        stockgraphs.plotGraphOfStock(ticker)
        
        self.assertTrue(os.path.isfile(ticker + ".jpeg"))
        
if __name__ == '__main__':
    unittest.main()