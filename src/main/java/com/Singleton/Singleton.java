package com.Singleton;

/***
 * 2019年8月1日21:01:54
 * Java单例模式之恶汉式
 * @author Shinelon
 *
 */
public class Singleton {
	public static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	// 提供外部的一个访问方法
	public static Singleton getSingleton() {
		return singleton;
	}
}
