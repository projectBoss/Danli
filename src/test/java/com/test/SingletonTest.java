package com.test;

import com.Singleton.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getSingleton();
		Singleton singleton2 = Singleton.getSingleton();
		System.err.println(singleton==singleton2);
	}
}
