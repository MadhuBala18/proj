package com.accolite.vrr.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan("com.accolite.vrr")
public class AppConfig {


		private final String URL = "jdbc:postgresql://localhost:5432/country";
		private final String USER = "postgres";
		private final String DRIVER = "org.postgresql.Driver";
		private final String PASSWORD = "postgres";

		@Bean
		DataSource dataSource() {
			DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
			driverManagerDataSource.setUrl(URL);
			driverManagerDataSource.setUsername(USER);
			driverManagerDataSource.setPassword(PASSWORD);
			driverManagerDataSource.setDriverClassName(DRIVER);
			return driverManagerDataSource;
		}
	
	
	
}
