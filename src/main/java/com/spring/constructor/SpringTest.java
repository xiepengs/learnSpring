package com.spring.constructor;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class SpringTest {
	public static void main(String[] args) throws IOException{
		Resource resource=new ClassPathResource("beanconstructor.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		HelloBean hello=(HelloBean) factory.getBean("helloBean");
		System.out.println(hello.sayHelloWorld());
	}

}
