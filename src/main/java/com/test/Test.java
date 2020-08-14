package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		六.使用AspectJ方式实现
//		1. 新建类,不用实现接口
//			1.1 类中方法名任意
//			1.2 配置spring 配置文件
//				1.2.1 <aop:after/> 后置通知,是否出现异常都执行
//				1.2.2 <aop:after-returing/> 后置通知,只有当切点正确执行时执行
//				1.2.3 <aop:after/> 和<aop:after-returing/> 和<aop:after-throwing/>执行顺序和配置顺序有关
//				1.2.4 execution() 括号不能扩上args
//				1.2.5  中间使用and 不能使用&& 由spring 把and 解析成&&
//				1.2.6 args(名称) 名称自定义的顺序和demo1(参数,参数)对应
//				1.2.7 <aop:before/> arg-names="名称" 名称来源于expression="" 中args(),名称必须一样
//					1.2.7.1 args() 有几个参数,arg-names 里面必须有几个参数
//					1.2.7.2 arg-names="名称" 里面名称必须和通知方法参数名对应
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo = ac.getBean("demo",Demo.class);
		try {
			demo.demo1("张三",12);
			demo.demo2("李四");
			demo.demo3("李四1");
			demo.demo4("李四2");
			demo.demo5();
			demo.demo6("李四3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
