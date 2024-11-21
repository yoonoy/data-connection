package com.example;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        try {
            Employee newEmployee = new Employee("Aiganysh Abdukaarova", "Computer Science", 950000, new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-15"));
            employeeData.createEmployee(newEmployee);

            Employee employee = employeeData.getEmployeeById(1);
            System.out.println("Retrieved Employee: " + employee);

            System.out.println("All Employees:");
            for (Employee emp : employeeData.getAllEmployees()) {
                System.out.println(emp);
            }

            if (employee != null) {
                employee.setPosition("Senior Developer");
                employee.setSalary(85000);
                employeeData.updateEmployee(employee);
            }

            employeeData.deleteEmployee(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
