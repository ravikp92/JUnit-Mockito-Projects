package com.ravi.mockito;

import java.util.List;

public class PortFolio {
	
	private List<Stock> stocks;
	private StockService stockService;
	
	public PortFolio(StockService stockService) {
		this.stockService=stockService;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public StockService getStockService() {
		return stockService;
	}

	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}
	
	public int getMarketValue() {
		int total= 0;
		
		for(Stock stock:stocks) {
			total= total+ (stockService.getStockPrice(stock) * stock.getStockQuantity());
		}
		return total;
	}

}
