package ValueInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Constructor_concepts.Order;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
   Prices apc=ctx.getBean(Prices.class);
   System.out.println(apc.getValue1());
   ctx.close();
   
   
   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("injection.xml");
	Prices order1=(Prices) context.getBean("prices");
   System.out.println(order1.getValue1());
   context.close();
	}

}
