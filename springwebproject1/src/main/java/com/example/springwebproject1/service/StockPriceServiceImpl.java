package com.example.springwebproject1.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springwebproject1.dao.StockPriceDao;
import com.example.springwebproject1.model.StockPrice;



public class StockPriceServiceImpl  implements StockPriceService{
	
	private StockPriceDao stockpricedao;

	@Override
	public StockPrice insertStock(StockPrice stockprice) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		stockpricedao.insertStock(stockprice);
		return  stockprice;
	}

	@Override
	public List<StockPrice> getAllStock() throws Exception {
		// TODO Auto-generated method stub
		return stockpricedao.getAllStock();
	}

}
