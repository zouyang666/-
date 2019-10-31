package com.sqgxy.SingleTonDemo;
/*
* 单例模式
* 第四种：双锁模式DCL(Double-check-locking)
* 特点：1.线程安全
* 		2.性能比较好
* 		3.懒加载
*问题：因为指令重排，导致空指针异常
* */
public class DCL {
	private static DCL instance=null;
	private DCL(){

	}

	public  /*synchronized */static DCL getInstance(){
		if(instance==null) {
			synchronized (DCL.class) {
				if (instance == null) {
					instance = new DCL();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			new Thread(()->{
				System.out.println(DCL.getInstance());
			}).start();
		}
	}
}
