package com.example.ang7hello.controllers;

import com.example.ang7hello.model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="http//localhost:4200")
@RestController
public class TestController {

    private List<Employee> employees = createList();

    @RequestMapping(value="/employees", method= RequestMethod.GET, produces="application/json")
    public List<Employee> firstPage() {
        return employees;
    }

    private static List<Employee> createList() {
        List<Employee> tempEmployees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Tobin Heath");
        emp1.setEmpId("1");
        emp1.setDesignation("Right Outside Midfielder");
        emp1.setSalary(100000);

        Employee emp2 = new Employee();
        emp2.setName("Megan Rapinoe");
        emp2.setEmpId("2");
        emp2.setDesignation("Left Outside Midfielder");
        emp2.setSalary(150000);

        tempEmployees.add(emp1);
        tempEmployees.add(emp2);
        return tempEmployees;
    }
}
