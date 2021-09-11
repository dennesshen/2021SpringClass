ackage com.study.spring.case5.aop_dancer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DancerMain {
	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance performance = (Performance)ctxApplicationContext.getBean("dancer");
		
		try {
			performance.perform();
		} catch (Exception e) {
			System.out.println(e);
			//轉換跑道
			//舞蹈轉唱歌
			Singer singer = (Singer) performance;
			singer.sing();
		}
		
	}
}
