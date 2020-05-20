package main.java.com.xtgj.j2ee.chapter10.impl;

import com.xtgj.j2ee.chapter10.OrderService;
import javafx.application.Application;

/**
 * 实现类
 * @author 迅腾国际
 *
 */
public class OrderServiceBean implements OrderService {

	public void save(String str) {
		System.out.println(" this is save method! "+str);
		
	}
	public  static  void manin(String[] args){
		ApplicationContext applicationXontext =new ClassPathXmlApplicationContext("applicationContext.xml");

		OrderServiceBean orderServiceBean=(OrderServiceBean) applicationContext.getBean("orderservice");

	//	System.out.println();
		orderServiceBean.save("! test aop");
	}
}

