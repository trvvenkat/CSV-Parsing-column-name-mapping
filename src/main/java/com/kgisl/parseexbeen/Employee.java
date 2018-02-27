package com.kgisl.parseexbeen;

import com.opencsv.bean.CsvBindByName;

public class Employee {
    
    @CsvBindByName
    private int id;
    
    @CsvBindByName
    private String name;
    
    @CsvBindByName
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getsalary() {
        return salary;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Emp{id=").append(id).append(", name=")
                .append(name).append(", salary=").append(salary).append("}");

        return builder.toString();
    }
}