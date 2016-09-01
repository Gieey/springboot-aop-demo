package net.gieey.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author gieey_china
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class WebApplication {

    @Bean
    public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
        return new MySecurityConfigurer();
    }

    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    public static class MySecurityConfigurer extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(AuthenticationManagerBuilder builder) throws Exception {
            builder.inMemoryAuthentication()
                    .withUser("user").password("user").roles("USER")
                    .and().withUser("admin").password("admin").roles("ADMIN");
        }
    }

    public static void main( String[] args )
    {
        SpringApplication.run(WebApplication.class, args);
    }
}
