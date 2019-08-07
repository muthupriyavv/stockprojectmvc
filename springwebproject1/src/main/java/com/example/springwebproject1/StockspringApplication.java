package com.example.springwebproject1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springwebproject1.controller.CompanyController;
import com.example.springwebproject1.controller.StockPriceController;
import com.example.springwebproject1.model.Company;

//@SpringBootApplication
public class StockspringApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(StockspringApplication.class, args);
		// beans are created
		int choice,ch;
		String c_name,ceo,brief;
		double turnover,current_price;
		System.out.println("Stock Chart Application");
		System.out.println("Select an option");
		System.out.println("1.Company Details 2.Stock Details 3.IPO Details ");
		Scanner s = new Scanner(System.in);
		choice =  s.nextInt();
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		switch(choice)
		{
		case 1:
			System.out.println("1.Insert 2.Display");
			CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
			ch = s.nextInt();
			if(ch==1)
			{
				Company company=new Company();	
				System.out.println("Enter the Company name");
				c_name = s.next();
				System.out.println("Enter turn over");
				turnover = s.nextDouble();
				s.nextLine();
				System.out.println("Enter ceo name");
				ceo = s.nextLine();
				System.out.println("Enter brief");
				brief=s.nextLine();
				company.setCompany_name(c_name);
				company.setTurnover(turnover);
				company.setCeo(ceo);
				company.setBrief(brief);
				companyController.insertCompany(company);	
			}
			else if(ch==2)
			{
				System.out.println(companyController.getCompanyList());
			}
			else
			{
				
			}
			break;
		
		case 2:
			System.out.println("1.Insert 2.Display");
			StockPriceController stockpricecontroller = (StockPriceController)applicationContext.getBean("stockpriceImpl");
			ch=s.nextInt();
			System.out.println("Enter the current price");
			
			
			
		}
	}

}
