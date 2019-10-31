package com.sqgxy.SingleTonDemo;
/*
 * 单例模式
 * 第六种：Holder：声明类时，成员变量中不声明实例变量，而是放在静态内部类中
 *比较广泛的单例模式
 * 特点：1.线程安全
 * 		2.性能好
 * 		3.懒加载
 * */
public class HolderDemo {
		private HolderDemo(){

		}
		private static class Holder{
			private static HolderDemo instance=new HolderDemo();
		}
		public static HolderDemo getInstance(){
			return Holder.instance;
		}

	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			new Thread(()->{
				System.out.println(HolderDemo.getInstance());
			}).start();
		}
	}
}
