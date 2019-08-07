package com.example.springwebproject1.model;

import java.util.Date;

public class StockPrice {
	
	private int company_code;
	private int stock_exchange;
	private double current_price;
	private String date;
	private String time;
	public int getCompany_code() {
		return company_code;
	}
	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}
	public int getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(int stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
