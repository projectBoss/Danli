package com.Singleton;

/**
 * 2019年8月1日21:09:10
 * Java单例模式之懒汉模式
 * @author Shinelon
 *
 */
public class EagerSingleton {
	public static EagerSingleton eagerSingleton = null;
	
	private EagerSingleton() {
		
	}
	
	// 提供外部的一个访问方法
	public static EagerSingleton getEagerSingleton() {
		if(eagerSingleton==null) {
			// 线程优化  不然在多线程调用的时候会创建多个对象
			synchronized (EagerSingleton.class) {
				if(eagerSingleton==null) {
					eagerSingleton = new EagerSingleton();
				}
			}
		}
		return eagerSingleton;
	}
}
