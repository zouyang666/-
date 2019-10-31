package com.sqgxy.SingleTonDemo;
/*
* 单例模式
* 第五种：Volatile+Double-check
* 特点：1.线程安全
* 		2.性能比较好
* 		3.懒加载
* */
public class VolatileDCL {
	private volatile static VolatileDCL instance=null;
	private VolatileDCL(){

	}

	public  /*synchronized */static VolatileDCL getInstance(){
		if(instance==null) {
			synchronized (VolatileDCL.class) {
				if (instance == null) {
					instance = new VolatileDCL();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			new Thread(()->{
				System.out.println(VolatileDCL.getInstance());
			}).start();
		}
	}
}
