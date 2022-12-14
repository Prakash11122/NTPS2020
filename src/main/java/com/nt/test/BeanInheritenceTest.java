package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.car;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		car car1=null,car2=null;
		
		//create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Beans
		car1=factory.getBean("prakashcar1",car.class);
		System.out.println(car1);
		System.out.println("============================");
		
		car2=factory.getBean("prakashcar2",car.class);
		System.out.println(car2);
		System.out.println("==========================");	

	}

}
