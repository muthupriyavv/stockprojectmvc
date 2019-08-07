package com.example.springwebproject1.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.springwebproject1.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public Company insertCompany(Company company) throws SQLException  {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock","root","root");
		PreparedStatement ps1=conn.prepareStatement("insert into company (comapny_name,turnover,ceo,briefwriteup) value(?,?,?,?)");
		ps1.setString(1, company.getCompany_name());
		ps1.setDouble(2, company.getTurnover());
		ps1.setString(3, company.getCeo());
		ps1.setString(4, company.getBrief());
		ps1.executeUpdate();
		return company;
	}

	
	public List<Company> getCompanyList() throws SQLException, ClassNotFoundException {
		List <Company> companyList=new ArrayList<Company>();
		try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			company=new Company();
			 String company_name=rs.getString("comapny_name");
			 company.setCompany_name(company_name);
			 Double turnover = rs.getDouble("turnover");
			 company.setTurnover(turnover);
			 String ceo = rs.getString("ceo");
			 company.setCeo(ceo);
			 String brief = rs.getString("briefwriteup");
			 company.setBrief(brief);
			 companyList.add(company);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}
