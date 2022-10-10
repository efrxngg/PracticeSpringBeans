package edu.spring.db.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import edu.spring.db.entity.Address;
import edu.spring.db.entity.Empresax;

@Configuration
@ComponentScan("edu.spring.db")
@PropertySource("classpath:datos-empresa.properties")
public class Config {

    @Bean(name = {"getAddress", "address"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Address getAddress() {
        return new Address("Coop. Test Mz-x Sl-4", 10);
    }
    
    @Bean(name = { "empresax" })
    public Empresax getEmpresax() {
        Empresax empresax = new Empresax();
        empresax.setAddress(getAddress());
        return empresax;
    }

}
