package pl.coderslab.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan //(to jest AppConfig) skanuje wszystko w dół, jesli APPconfig jestnagorze to nie trzeba nic dopisywać
@EnableWebMvc
@EnableTransactionManagement
public class Application {
}
