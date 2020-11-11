package com.kg.myapp;

public class AnnoMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		MyContext con = new MyContext();
		MyData myData = con.getInstance(MyData.class);
		System.out.println(myData.name);
		System.out.println(myData.tosay);
	}

}
