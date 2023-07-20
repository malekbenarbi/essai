package proj.example.RegisterAndLogin;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
@Configuration
public class ConfigSecurity extends WebSecurityConfiguration
{
protected void configure(HttpSecurity httpSecurity) throws Exception {
	httpSecurity.csrf(AbstractHttpConfigurer::disable);
}
}
