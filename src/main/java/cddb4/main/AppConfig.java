package cddb4.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "cddb4.dao", "cddb4.service" })
public class AppConfig {
}
