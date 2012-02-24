package com.devx.hessian.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MainClient client = (MainClient) context.getBean("mainClient");
		
		client.testService();


	}

}
