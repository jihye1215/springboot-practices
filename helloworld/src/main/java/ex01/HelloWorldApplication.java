package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Boorstrapping class
 * 
 * 1. 스프링부트 어플리케이션의 부트스트래핑(BootStrapping)
 * 2. 설정 클래스로 역활(Configuration Class)
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2. 웹 애플리케이션 타입인지를 판단(Web Application 인 경우, MVC or Reactive 타입 결정)
		 * 3. 어노테이션 스캐닝(auto) or Configuration Class(Explicit) 통한 빈 생성/등록 및 와이어링
		 * 4. 웹 어플리케이션(MVC) 
		 * 	  - 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 *    - 서버 인스턴스 웹 애플리케이션 배포 
		 *    - 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스 구현한 빈을 찾아서 실행(run 호출)
		 */
//		ConfigurableApplicationContext c = null;
//		try {
//			c = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
		// try ~ with ~ resource
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)) {
			
		} 
	}

}
