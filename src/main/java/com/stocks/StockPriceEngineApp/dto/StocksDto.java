package com.stocks.StockPriceEngineApp.dto;

import java.util.List;

public class StocksDto {
	private Company CompanyName;
	private List<Integer> AskPrice;
	private List<Integer> BidPrice;

	public StocksDto(Company companyName, List<Integer> askPrice, List<Integer> bidPrice) {
		super();
		CompanyName = companyName;
		AskPrice = askPrice;
		BidPrice = bidPrice;
	}

	public Company getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(Company companyName) {
		CompanyName = companyName;
	}

	public List<Integer> getAskPrice() {
		return AskPrice;
	}

	public void setAskPrice(List<Integer> askPrice) {
		AskPrice = askPrice;
	}

	public List<Integer> getBidPrice() {
		return BidPrice;
	}

	public void setBidPrice(List<Integer> bidPrice) {
		BidPrice = bidPrice;
	}

}
