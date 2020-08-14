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
		
//		三. 配置异常通知的步骤(AspectJ 方式)
//		1. 只有当切点报异常才能触发异常通知
//		2. 在spring 中有AspectJ 方式提供了异常通知的办法.
//			2.1 如果希望通过schema-base 实现需要按照特定的要求自己编写方法.
//		3. 实现步骤:
//			3.1 新建类,在类写任意名称的方法
//			3.2 在spring 配置文件中配置
//				3.2.1 <aop:aspect>的ref 属性表示:方法在哪个类中.
//				3.2.2 <aop: xxxx/> 表示什么通知
//				3.2.3 method: 当触发这个通知时,调用哪个方法
//				3.2.4 throwing: 异常对象名,必须和通知中方法参数名相同(可以不在通知中声明异常对象)
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
