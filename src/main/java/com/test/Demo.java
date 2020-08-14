package com.test;

public class Demo {
	public void demo1(String name,int age) {
		System.out.println("demo1"+name+age);
	}
	public void demo2(String name) {
		System.out.println("demo2"+name);
	}
	public void demo3(String name) {
		System.out.println("demo3"+name);
//		int a =5/0;
	}
	public void demo4(String name) {
		System.out.println("demo4"+name);
//		int a =5/0;
	}
	public void demo5() {
		System.out.println("demo5");
	}
	public void demo6(String name) {
		System.out.println("demo6"+name);
		int a = 5/0;
	}
}
