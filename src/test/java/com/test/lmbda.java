package com.test;

public class lmbda {
	public static void main(String[] args) {
		// new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		new Thread(()->System.out.println("insert")).start();
	}
}
