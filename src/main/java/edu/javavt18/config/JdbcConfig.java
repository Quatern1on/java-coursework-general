package edu.javavt18.config;

import edu.javavt18.dao.CarBrandDAO;
import edu.javavt18.dao.CarModelDAO;
import edu.javavt18.dao.jdbc.CarBrandDAOJdbcImpl;
import edu.javavt18.dao.jdbc.CarModelDAOJdbcImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Autowired
    private DataSource dataSource;


    @Bean
    public CarBrandDAO getCarBrandJdbcDAO() {
        return new CarBrandDAOJdbcImpl(dataSource);
    }
    @Bean
    public CarModelDAO getCarModelJdbcDAO() {
        return new CarModelDAOJdbcImpl(dataSource);
    }
}