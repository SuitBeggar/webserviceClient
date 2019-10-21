package main;

import webservice.TestWebserviceImp;
import webservice.TestWebserviceImpService;

public class TestClient {
	public static void main(String[] args) {
		TestWebserviceImp test=new TestWebserviceImpService().getTestWebserviceImpPort();
	     String name=test.getName("1");
	     System.out.println(name);
	}
}
