from iexfinance import get_historical_data
import datetime
import matplotlib.pyplot as plt

companyList = ["abbv", "msft", "snap", "fb", "mu", "amrs", "amzn", "intc", "goog", "abt", "xom", "mmm", "axp", "adbe", "aet", "all", "amd", "cmcsa", "aks", "jnj", "wmt", "avy", "adsk"]

def plotGraphOfStock(ticker):

    end = datetime.datetime.now() # get the current date and time
    month = datetime.timedelta(days = 30) # create the equivalent of one month
    start = end - month # get the date and time of one month ago
    
    df = get_historical_data(ticker, start=start, end=end, output_format='pandas')
    df.plot()
    
    plt.title(ticker) # title the graph
    plt.grid() # add a grid
    
    figure = plt.gcf()
    figure.savefig(ticker + ".jpeg", bbox_inches = "tight", dpi = 100) # save graph as pdf

#plotGraphOfStock("ABBV")

for i in companyList:
    plotGraphOfStock(i.upper())

