package com.Singleton;

/***
 * 2019��8��1��21:01:54
 * Java����ģʽ֮��ʽ
 * @author Shinelon
 *
 */
public class Singleton {
	public static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	// �ṩ�ⲿ��һ�����ʷ���
	public static Singleton getSingleton() {
		return singleton;
	}
}
