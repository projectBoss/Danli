package com.test;

import com.Singleton.EagerSingleton;

public class EagerSingletonTest {
	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getEagerSingleton();
		EagerSingleton eagerSingleton1 = EagerSingleton.getEagerSingleton();
		System.err.println(eagerSingleton==eagerSingleton1);
	}
}
