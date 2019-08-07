package com.Singleton;

/**
 * 2019��8��1��21:09:10
 * Java����ģʽ֮����ģʽ
 * @author Shinelon
 *
 */
public class EagerSingleton {
	public static EagerSingleton eagerSingleton = null;
	
	private EagerSingleton() {
		
	}
	
	// �ṩ�ⲿ��һ�����ʷ���
	public static EagerSingleton getEagerSingleton() {
		if(eagerSingleton==null) {
			// �߳��Ż�  ��Ȼ�ڶ��̵߳��õ�ʱ��ᴴ���������
			synchronized (EagerSingleton.class) {
				if(eagerSingleton==null) {
					eagerSingleton = new EagerSingleton();
				}
			}
		}
		return eagerSingleton;
	}
}
