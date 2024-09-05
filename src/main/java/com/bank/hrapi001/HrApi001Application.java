package com.bank.hrapi001;

import com.bank.hrapi001.entity.Department;
import com.bank.hrapi001.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrApi001Application {


    public static void main(String[] args) {
        SpringApplication.run(HrApi001Application.class, args);

        Employee employee1 = new Employee(1L, "James", 423450.00);
        Employee employee2 = new Employee(2L, "Estaing", 4654350.00);
        Employee employee3 = new Employee(3L, "Jolyn", 45765430.00);
        //System.out.println(employee1.getName() );

        Department department = new Department("IT");

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        department.addEmployee(new Employee(4L, "Nguyen", 350.00));

        Employee[] employeeArray = department.getEmployees();

        for(Employee emp: employeeArray){
            System.out.println("Emp " + emp);
        }
        System.out.println("Total " + department.getTotalSalary());
        System.out.println("Average " + department.getAverageSalary());
        System.out.println("Average " + department.getEmployeeById(3L));

    }
}



