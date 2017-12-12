package ru.javabegin.training.spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/* 2-й вариант вызова методов до создания и после создания объектов 
        в xml подключаем бин-класс MyBeanPostProcessor который имплементирует интерфейс BeanPostProcessor,
в котором нужно переопеределить два метода:
postProcessAfterInitialization и postProcessBeforeInitialization - до и после инициализации
*/
public class MyBeanPostProcessor implements BeanPostProcessor {
    
	@Override
	public Object postProcessAfterInitialization(Object object, String name) throws BeansException {
            System.out.println("\t MyBeanPostProcessor[" + object + "] - postProcessAfterInitialization");
            return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
            System.out.println("\t MyBeanPostProcessor[" + object + "] - postProcessBeforeInitialization()");
            return object;
	}

}
