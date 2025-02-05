package com.empapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages ={"com.empapp"} )
//@PropertySource(value = {"classpath:application.properties"})
@EnableTransactionManagement

public class AppConfig {
//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String userName;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//    @Value("${spring.datasource.driverClassName}")
//    private String driverName;

    //i need to configure dataSource?
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/trainingdb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
    //jdbcTemplate
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager(dataSource);
        return transactionManager;
    }

}
