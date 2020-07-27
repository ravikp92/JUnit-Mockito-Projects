package com.ravi.mockito;

public class Stock {
	private int stockId;
	private String stockName;
	private int stockQuantity;

	public Stock() {

	}
	

	public Stock(int stockId, String stockName, int stockQuantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockQuantity = stockQuantity;
	}


	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

}
