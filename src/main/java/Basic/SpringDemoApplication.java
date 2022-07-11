package Basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDemoApplication {

	public static void main(String[] args) {
	
		/*    Pre-Instainiated()
		 * Classpathxmlapplication context will create 
		 * all the bean(Only singleton) present in "Basic.xml"
		 * and do injection as well
		 */
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Basic.xml");
		
		/*
		 * To avoid the Pre-instaination Use Bean factory
		 */
		//BeanFactory bfact=new XmlBeanFactory(new ClassPathResource("Basic.xml"));
		
		
		//FileSystemXmlApplicationContext ctx1= new FileSystemXmlApplicationContext("classpath:Basic.xml");
		 
		  ComponentC object=(ComponentC) ctx.getBean("componentC");
		  System.out.println(object);
		  
			
			  AccountDetails accDetail= ctx.getBean("AccountInfo",AccountDetails.class);
			  accDetail.print();
			 
		  //System.out.println(accDetail);
		 
			/*
			 * wrote for check the object is singleton or not 
			 * if singeleton...Hashcode is same for every object
			 * if prototype ....hashcode is different for each object
			 */
			/*
			 * AccountDetails accDetail2= ctx.getBean(AccountDetails.class);
			 * System.out.println(accDetail2);
			 */
		 
		ctx.close();
		
		
	}

}
