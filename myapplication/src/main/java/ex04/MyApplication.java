package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
/**
* 
* @SpringBootApplication 메타 어노테이션
* 
* + @SpringBootConfiguration (cf. @Configuration)
* + @ComponentScan
* + @EnableAutoConfiguration (웹MVC 설정, aop, security, jpa 등을 자동 디폴트 설정 on Dependency starter)
* 
*/

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {
			
		} 

	}

}
