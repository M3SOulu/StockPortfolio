package fi.oulu.tol.sqat;

import java.util.ArrayList;

public class Portfolio {
	private StockMarket market;
	private String name;
	private ArrayList<Stock> stocks;
	
	public Portfolio(){
		this.stocks = new ArrayList<>();
	}
	
	public StockMarket getMarket() {
		return market;
	}
	public void setMarket(StockMarket market) {
		this.market = market;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}
	
	public void addStock(Stock s){
		this.stocks.add(s);
	}
	
	public Double getTotalValue(){
		Double result = 0.0;
		for (Stock stock : stocks) {
			result += this.market.getPrice(stock.getName())*stock.getQuantity();
		}
		return result;
	}
}
