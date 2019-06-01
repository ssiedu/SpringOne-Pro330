package com.ssi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String[] args) {

		//creating our object not taking help of IoC container
		//Test t=new Test();
		//t.show();
		
		//now we want spring container to create and manage objects
		
		
		//creating an object of IoC Container
		
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		//ask IoC container to provide you an object.
		
		Test obj=(Test)beanFactory.getBean("testObj");

		obj.show();
		
		
		

	}

}
