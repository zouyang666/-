package com.sqgxy.SingleTonDemo;
/*
* 单例模式
* 第三种：懒汉式+synchronized(同步方法)
* 特点：1.线程安全，保证对象的唯一性
* 		2.synchronized，退化到串行执行，性能不好
* 		3.懒加载
*
* */
public class HoonSingleTonAndsyn {
	private static HoonSingleTonAndsyn instance=null;
	private HoonSingleTonAndsyn(){

	}

	public  synchronized static HoonSingleTonAndsyn getInstance(){
		if(instance==null){
			instance=new HoonSingleTonAndsyn();
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			new Thread(()->{
				System.out.println(HoonSingleTonAndsyn.getInstance());
			}).start();
		}
	}
}
