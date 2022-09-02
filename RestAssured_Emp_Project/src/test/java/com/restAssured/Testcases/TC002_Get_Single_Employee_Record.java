package com.restAssured.Testcases;

import org.testng.annotations.BeforeClass;

import com.restAssured.base.Base;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC002_Get_Single_Employee_Record extends Base
{
	@BeforeClass
   void getEmpData() throws InterruptedException
   {
	   logger.info("********************TC002_Get_Single_Employee_Record***********************");
       RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
       hreq=RestAssured.given();
       response=hreq.request(Method.GET, "/employee/\"+empID");
       Thread.sleep(7000);
  
   }
}
