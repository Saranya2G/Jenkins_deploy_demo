package com.javatpoint.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmployeeTest {
    @InjectMocks
    Employee employee;

    @Test
    void employeeTest(){
        employee.setId(1);
        employee.setFirstName("Sam");
        employee.setEmail("sam@gmail.com");
        employee.setLastName("Ram");

        String employeeModel = String.valueOf(employee.getFirstName());
        employee.getId();
        employee.getFirstName();
        employee.getEmail();
        employee.getLastName();
        assertEquals(employeeModel,employee.getFirstName());



    }
}
