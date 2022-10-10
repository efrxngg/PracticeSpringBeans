package edu.spring.db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.spring.db.entity.Director;
import edu.spring.db.entity.Report;
import edu.spring.db.interfaces.IBaseReport;

@Configuration
@PropertySource("classpath:datos-empresa.properties")
public class EmpleadosConfig {

    // El nombre del metodo sera el id del bean
    @Bean
    public IBaseReport getReport() {
        return new Report();
    }

    @Bean
    public Director getDirector() {
        return new Director(getReport());
    }
}
