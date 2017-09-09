package com.test.spring.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScopeSingletonAndPrototype {
	
	public static void main(String[] args) {

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       
       // test singleton spring bean scope
       Coach bean1 = context.getBean("tennisCoachSingleton",Coach.class);
       Coach bean2 = context.getBean("tennisCoachSingleton",Coach.class);
       System.out.println("Are the two beans same :" + (bean1 == bean2));
       System.out.println("bean1: " + bean1);
       System.out.println("bean2: "+ bean2);
       
       System.out.println();
       
       // test prototype spring bean scope
       Coach bean3 = context.getBean("tennisCoachPrototype",Coach.class);
       Coach bean4 = context.getBean("tennisCoachPrototype",Coach.class);
       System.out.println("Are the two beans same :" + (bean3 == bean4));
       System.out.println("bean3: " + bean4);
       System.out.println("bean4: "+ bean4);
       System.out.println(bean4.getDailyFortune());

       context.close();

    }

}