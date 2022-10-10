package edu.spring.db.entity;

import org.springframework.beans.factory.annotation.Value;

import edu.spring.db.interfaces.IBaseReport;
import edu.spring.db.interfaces.IEmpleado;

public class Director implements IEmpleado {

    private IBaseReport report;
    @Value("${email.directiva}")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Director(IBaseReport report) {
        this.report = report;
    }

    public void setReport(IBaseReport report) {
        this.report = report;
    }

    @Override
    public String getTask() {
        return "Dirigir Empresa";
    }

    @Override
    public String getReport() {
        return report.getReport();
    }
}
