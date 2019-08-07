package com.example.springwebproject1.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.springwebproject1.model.StockPrice;
import com.example.springwebproject1.service.StockPriceService;



public class StockPriceControllerImpl implements StockPriceController {
	
	 private StockPriceService stockpriceservice ;

	@Override
	public StockPrice insertStock(StockPrice stockprice)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	    stockpriceservice.insertStock(stockprice);
		return stockprice;
	}

	@Override
	public List<StockPrice> getAllStock() throws Exception {
		// TODO Auto-generated method stub
		return stockpriceservice.getAllStock();
	}

}
