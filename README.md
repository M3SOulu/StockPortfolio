StockPortfolio
==============

A simple implementation of a stocks' portfolio to demonstrate the use of mocking principles for unit-testing.  
I have used [EasyMock](http://easymock.org) as a framework of reference.  
To import the framework in you Eclipse Java project please refere to [this](http://stackoverflow.com/questions/3280353/how-to-import-a-jar-in-eclipse) article on Stack Overflow

### Instructions

You are building an application for maintaining user's stock portfolios. Your application would use a stock market service to retrieve stock prices from a real server (such as NASDAQ).

When it comes to testing your code, you wouldn't want to hit the real stock market server for fetching the stock prices. Instead, you would like some dummy price values. So, you need to mock the stock market service that returns dummy values without hitting the real server.
