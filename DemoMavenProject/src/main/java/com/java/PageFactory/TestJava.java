package com.java.PageFactory;

import com.generic.Pojo;

public class TestJava {

	public TestJava() {
		
	}
			
		public void openURLforFB()
		{
			Pojo.getDriver().get("https://www.facebook.com/reg/");
			System.out.println("Facebook is opened.");
		}
	
}
