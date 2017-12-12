package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
                
                System.out.println("\n================ Variant 1 ==================");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000_v1");
                System.out.println(t1000);
                
                System.out.println("\n================ Variant 2 ==================");                 
		t1000 = (ModelT1000) context.getBean("t1000_v2");
		System.out.println(t1000);
                
                System.out.println("\n================ Variant 3 ==================");
		t1000 = (ModelT1000) context.getBean("t1000_v3");
		System.out.println(t1000);
        }
}
