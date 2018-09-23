import unittest
import stocks

from alpha_vantage.timeseries import TimeSeries
import matplotlib
import matplotlib.pyplot as plt
import os

class TestCases(unittest.TestCase):
    
    def test_plotTimeIntervalHour(self):
        
        timeInterval = "hour"
        stocks.checkTimeInterval(timeInterval)
        
        self.assertTrue(os.path.isfile("stock.pdf"))

    def test_plotTimeIntervalDay(self):
        
        timeInterval = "day"
        stocks.checkTimeInterval(timeInterval)
        
        self.assertTrue(os.path.isfile("stock.pdf"))

    def test_plotTimeIntervalWeek(self):
        
        timeInterval = "week"
        stocks.checkTimeInterval(timeInterval)
        
        self.assertTrue(os.path.isfile("stock.pdf"))

    def test_plotTimeIntervalMonth(self):
        
        timeInterval = "month"
        stocks.checkTimeInterval(timeInterval)
        
        self.assertTrue(os.path.isfile("stock.pdf"))

if __name__ == '__main__':
    unittest.main()
