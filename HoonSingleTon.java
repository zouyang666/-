package com.sqgxy.SingleTonDemo;
/*
* 单例模式
* 第二种：懒汉式
* 特点：1.线程不安全
* 			俩线程同时执行到如下代码就导致线程不安全，
* 			不能保证实例对象的唯一性
* 			if(instance==null){
			instance=new HoonSingleTon();
		}
* 		2.性能好
* 		3.是懒加载
* */
public class HoonSingleTon {
	private static HoonSingleTon instance=null;
	private HoonSingleTon(){

	}

	public  static HoonSingleTon getInstance(){
		if(instance==null){
			instance=new HoonSingleTon();
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			new Thread(()->{
				System.out.println(HoonSingleTon.getInstance());
			}).start();
		}
	}
}
