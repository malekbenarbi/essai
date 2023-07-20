package proj.example.RegisterAndLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"proj.example.RegisterAndLogins"})
@SpringBootApplication(scanBasePackages = {"proj.example.RegisterAndLogin.Controller"+"proj.example.RegisterAndLogin.service"})
@EntityScan("proj.example.RegisterAndLogin")
public class RegisterAndLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterAndLoginApplication.class, args);
	}

}
