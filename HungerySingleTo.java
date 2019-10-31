package com.sqgxy.SingleTonDemo;
/*
* 单例模式
* 第一种：饿汉式
* 特点：1.线程安全:在加载时已经被实例化所以只有这一次
* 		2.性能比较好
* 		3.不是懒加载
* */
public class HungerySingleTo {
	//在加载时创建对象实例化对象
	private static HungerySingleTo instance=new HungerySingleTo();
	//无参构造方法
	private HungerySingleTo(){

	}
	//获取实例化对象
	public static HungerySingleTo getInstance(){
		return instance;
	}

	public static void main(String[] args) {
		//创建多个线程去访问
		for (int i = 0; i <10 ; i++) {
			new Thread(()->{
				System.out.println(HungerySingleTo.getInstance());
			}).start();
		}
	}
}
