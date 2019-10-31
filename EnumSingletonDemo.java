package com.sqgxy.SingleTonDemo;
/*
* 单例模式
* 第七种：枚举
* 常量，在加载的时候实例化一次
*
*
* */
public class   EnumSingletonDemo{
	private EnumSingletonDemo(){

	}
		private enum EnumHolder{
			INSTANCE;
			private EnumSingletonDemo instance;
			EnumHolder(){
				this.instance=new EnumSingletonDemo();
			}
			private  EnumSingletonDemo getInstance(){
				return  instance;
			}
		}
	public static EnumSingletonDemo getInstance(){
			return EnumHolder.INSTANCE.instance;
		}



	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			System.out.println(EnumSingletonDemo.getInstance());
		}
	}
}
