package edu.spring.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import edu.spring.db.config.InyeccionCollections;
import edu.spring.db.entity.Director;
import edu.spring.db.entity.EmpresaDos;
import edu.spring.db.entity.Empresax;
import edu.spring.db.entity.ListCollectionBean;
import edu.spring.db.entity.PerroNegro;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private Empresax empresax;

    @Autowired
    private Director director;
    
    @Autowired
    private EmpresaDos empresaDos;

    @Override
    public void run(String... args) throws Exception {
        // Inyeccion de Colleciones
        exampleCollection();

        // Inyeccion de obj
        exampleObj();
        
        // Inyeccion mediante campo
        exampleFieldInyeccion();

        // Lombok
        exampleLombok();
    }

    private void exampleCollection() throws Exception {
        var context = new AnnotationConfigApplicationContext(InyeccionCollections.class);
        ListCollectionBean programingLanguages = context.getBean(ListCollectionBean.class);
        programingLanguages.printList();
        context.close();
    }

    private void exampleObj() {
        System.out.println(empresax.toString());
        System.out.println(director.getEmail());
        System.out.println(director.getTask());
        System.out.println(director.getReport());
    }

    private void exampleLombok() {
        var miPerro = new PerroNegro();

        System.out.println(new StringBuilder()
                .append(miPerro.getName())
                .append("\n")
                .append(miPerro.toString()));
    }
    private void exampleFieldInyeccion() {
        System.out.println(empresaDos.toString());   
    }
}
