package edu.spring.db.config;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import edu.spring.db.entity.ListCollectionBean;

@Configuration
public class InyeccionCollections {

    @Bean
    public ListCollectionBean getListCollectionBean() {
        return new ListCollectionBean();
    }

    @Lazy
    @Bean
    public List<String> listOfProgramingLenguages() {
        return List.of("Java", "C#", "Python", "JavaScript");
    }

    @PostConstruct
    public void initListOfProgramingLenguages() {
        System.out.println("Cargando la lista de lenguajes...");
    }

    @PreDestroy
    public void destroyListOfProgramingLenguages() {
        System.out.println("Liberando Recursos");
    }

}
