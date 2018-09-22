api_key = "VEULVCHDZUTSRJY3"

company = "apple"
company = company.lower()
symbol = ""

if company == "google":
    symbol = "GOOGL"

elif company == "microsoft":
    symbol = "MSFT"

elif company == "facebook":
    symbol = "FB"

elif company == "apple":
    symbol = "AAPL"

else: print "Company Not Found"

timeInterval = "hour"
timeInterval = timeInterval.lower()

from alpha_vantage.timeseries import TimeSeries
import matplotlib
import matplotlib.pyplot as plt

# set size of plot
matplotlib.rcParams['figure.figsize'] = (15.0, 7.5)

ts = TimeSeries(key = api_key, output_format = 'pandas')

def plotTimeInterval(data):
    figure = plt.figure()
    data['4. close'].plot()
    plt.title("Times Series for the " + company + " Stock " + "(" + timeInterval + ")")
    plt.grid()
    plt.show()
    
    figure.savefig("stock.pdf", bbox_inches = "tight")

def checkTimeInterval(timeInterval):

    if timeInterval == "hour":
        data, metaData = ts.get_intraday(symbol = symbol, interval = "60min", outputsize = "full")
        plotTimeInterval(data)
    
    elif timeInterval == "day":
        data, metaData = ts.get_daily(symbol = symbol, outputsize = "full")
        plotTimeInterval(data)
    
    elif timeInterval == "week":
        data, metaData = ts.get_weekly(symbol = symbol)
        plotTimeInterval(data)
    
    elif timeInterval == "month":
        data, metaData = ts.get_monthly(symbol = symbol)
        plotTimeInterval(data)
    
    else: print "Invalid Interval"

checkTimeInterval(timeInterval)