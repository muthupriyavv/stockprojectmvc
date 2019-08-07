package com.example.springwebproject1.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.springwebproject1.model.StockPrice;


public interface StockPriceController {
	public StockPrice insertStock(StockPrice stockprice) throws SQLException, ClassNotFoundException;
	public List<StockPrice> getAllStock() throws Exception;
}
