package edu.spring.db.entity;

import edu.spring.db.interfaces.IBaseReport;

public class Report implements IBaseReport{

    @Override
    public String getReport() {    
        return "Informe Generado Correctamente";
    }
    
}
