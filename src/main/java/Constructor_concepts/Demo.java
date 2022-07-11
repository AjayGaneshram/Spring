package Constructor_concepts;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Constructor.xml"));
        
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Constructor.xml");
		Order order1=(Order) context.getBean(Order.class);
	    System.out.println(order1);
	    
	    
	    OrderFactory ordFac= context.getBean(OrderFactory.class);
	    System.out.println(ordFac);
		
	}

}
