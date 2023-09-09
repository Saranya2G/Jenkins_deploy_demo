package com.javatpoint.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmployeesTest {

    @InjectMocks
    Employees employees;

    List<Employee> employeeList = new ArrayList<>();
    Employee employee = new Employee();

    @Test
    void employeesModeTest(){
        employee.setId(1);
        employee.setEmail("sam@gmail.com");
        employee.setFirstName("sam");
        employeeList.add(employee);
        employees.setEmployeeList(employeeList);

        Integer employeesModel = employeeList.size();

        employees.getEmployeeList();
        assertEquals(employeesModel,employeeList.size());


    }
}
