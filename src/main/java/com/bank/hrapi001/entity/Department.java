package com.bank.hrapi001.entity;

import java.util.List;
import java.util.Objects;

public class Department {
    private String name;

   private  Employee[] employees = new Employee[10];
   private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add an employee
    public void addEmployee(Employee employee){

        if(lastAddedEmployeeIndex < employees.length){
            lastAddedEmployeeIndex ++;
            employees[lastAddedEmployeeIndex] = employee;

        }
    }

    // Get an employee

    public Employee[] getEmployees() {

    Employee[] newEmplyee = new Employee[lastAddedEmployeeIndex +1];
        for(int i = 0; i < newEmplyee.length; i++){
            newEmplyee[i] = employees[i];
        }
        return newEmplyee;

    }

    // Get an employee by its index.
    public int getEmployeeCount(){
        return lastAddedEmployeeIndex +1;
    }

    // Get an Employee by ID.

    public  Employee getEmployeeById(Long id){
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getId() == (id)) {
                    return emp;

                }

            }
        }
        return null;

    }
    // Get all employees

    public double getTotalSalary(){
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
          totalSalary= employees[i].getSalary();

        }
        return totalSalary;
    }
// Calculate the average salary
    public double getAverageSalary(){
        if (lastAddedEmployeeIndex > -1){
            return  getTotalSalary()/ (lastAddedEmployeeIndex +1);
        }
        return 0.0;
    }
}
