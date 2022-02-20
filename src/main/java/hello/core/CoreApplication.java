package hello.core;

import hello.core.member.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		// ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
	}

}
