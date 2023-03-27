package com.ciq.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@ComponentScan(basePackages = { "com.ciq.*" })
//@EnableTransactionManagement(proxyTargetClass = true)
@PropertySource("classpath:db.properties")
public class SpringConfigApp {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getProperty("mysqlDriver"));
		dataSource.setUrl(environment.getProperty("mysqlUrl"));
		dataSource.setUsername(environment.getProperty("mysqlUN"));
		dataSource.setPassword(environment.getProperty("mysqlPW"));
		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
		return properties;
	}

	@Bean
	public SessionFactory getLocalSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		factoryBean.setPackagesToScan(new String[] { "com.ciq" });
		factoryBean.setHibernateProperties(getHibernateProperties());
		try {
			factoryBean.afterPropertiesSet();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factoryBean.getObject();
	}

	@Bean
	public HibernateTemplate gethiHibernateTemplate() {
		return new HibernateTemplate(getLocalSessionFactoryBean());
	}

	@Bean
	public HibernateTransactionManager getHibernateTransactionManager() {
		return new HibernateTransactionManager(getLocalSessionFactoryBean());

	}

}
