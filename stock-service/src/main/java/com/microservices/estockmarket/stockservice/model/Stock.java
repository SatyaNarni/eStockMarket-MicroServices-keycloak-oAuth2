package com.microservices.estockmarket.stockservice.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.data.annotation.Id;

@Document(collection = "stock_data")
public class Stock {
	@Id
	private int stockId;
	private String companyCode;
	private BigDecimal stockPrice;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date timeStamp;

	public Stock() {
		super();
	}

	public Stock(int stockId, String companyCode, BigDecimal stockPrice, Date timeStamp) {
		super();
		this.stockId = stockId;
		this.companyCode = companyCode;
		this.stockPrice = stockPrice;
		this.timeStamp = timeStamp;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public BigDecimal getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(BigDecimal stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
