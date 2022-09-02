package com.restAssured.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base
{
	public Logger logger;
	public static RequestSpecification hreq;
	public static Response response;
	public String empID="11"; //Hard coded - Input for Get details of Single Employee & update employee
	
	@BeforeClass
	public void setup()
	{
	    logger = Logger.getLogger("Employee_RestAPI");
		PropertyConfigurator.configure("log4j.properties");   // logger Added
		logger.setLevel(Level.DEBUG);
	}

}
