package com.example.springwebproject1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.springwebproject1.model.Company;
import com.example.springwebproject1.model.StockPrice;

public class StockPriceDaoImpl implements StockPriceDao{

	@Override
	public StockPrice insertStock(StockPrice stockprice) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock","root","root");
		PreparedStatement ps1=conn.prepareStatement("insert into stockpricedetail (current_price,dated,c_time) value(?,?,?)");
		ps1.setDouble(1, stockprice.getCurrent_price());
		ps1.setString(2, stockprice.getDate());
		ps1.setString(3, stockprice.getTime());
		ps1.executeUpdate();
		return  stockprice;
	}

	@Override
	public List<StockPrice> getAllStock() throws Exception {
		// TODO Auto-generated method stub
		List <StockPrice> stocklist=new ArrayList<StockPrice>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from stockpricedetail");
		ResultSet rs=	ps.executeQuery();
		StockPrice stockprice=null;
		while(rs.next()){
		     stockprice = new StockPrice();
			 Double price=rs.getDouble("current_price");
			 stockprice.setCurrent_price(price);
			 String s_date = rs.getString("dated");
			 stockprice.setDate(s_date);
			 String s_time = rs.getString("c_time");
			 stockprice.setTime(s_time);
			 stocklist.add(stockprice);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return stocklist;
	}

}
