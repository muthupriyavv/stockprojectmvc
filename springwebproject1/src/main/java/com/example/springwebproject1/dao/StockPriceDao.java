package com.example.springwebproject1.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.springwebproject1.model.StockPrice;


public interface StockPriceDao {
 

	public StockPrice insertStock(StockPrice stockprice) throws SQLException, ClassNotFoundException;
	public List<StockPrice> getAllStock() throws Exception;
}
