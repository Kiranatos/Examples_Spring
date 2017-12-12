package ru.javabegin.training.spring.replacer;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

public class ActionReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {		
		System.out.println("Этот метод reimplement из класса ActionReplacer заменил стандартный метод action из класса ModelT1000");
		return null;
	}
}
