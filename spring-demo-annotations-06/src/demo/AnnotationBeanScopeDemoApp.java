package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("giong nhau ko " + result);
		System.out.println("memory the coach: " + theCoach);
		System.out.println("memory alpha coach: " + alphaCoach);
	}
}
