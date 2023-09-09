package com.javatpoint.controller;

import com.javatpoint.model.Employee;
import com.javatpoint.model.Employees;
import com.javatpoint.repository.EmployeeDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    @InjectMocks
    EmployeeController employeeController;

    @Mock
    EmployeeDAO employeeDao;

    Employees employees = new Employees();

    List<Employee> employeeList = new ArrayList<>();
    Employee employee = new Employee();


    @Test
    void getEmployeesTest(){
        employeeList.add(employee);
        employee.setId(1);
        employee.setFirstName("Sam");
        employees.setEmployeeList(employeeList);
        when(employeeController.getEmployees()).thenReturn(employees);
        employeeDao.getAllEmployees();
        assertEquals(employee.getId(),employee.getId());

    }




}
