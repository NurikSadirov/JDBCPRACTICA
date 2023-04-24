package org.example;

import org.example.config.Config;
import org.example.model.Employee;
import org.example.model.Job;
import org.example.service.JobService;
import org.example.service.impl.EmployeeServiceImpl;
import org.example.service.impl.JobServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println(Config.getConnection());

        JobService jobService = new JobServiceImpl();
//        jobService.createJobTable();
//        jobService.addJob(new Job("Mentor","IT","Java",9));
//        jobService.addJob(new Job("Instructor","IT","JS",5));
//        jobService.addJob(new Job("Admin","IT","Java",9));
//        System.out.println(jobService.getJobById(1L));
//        System.out.println(jobService.sortByExperience(new Scanner(System.in).nextLine()));
//        jobService.deleteDescriptionColumn();

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//        employeeService.createEmployee();
//        employeeService.addEmployee(new Employee("Nurseyit","Sadirov",16,"nurseyit@gmail.com",1));
//        employeeService.addEmployee(new Employee("Adilet ","Islambek uulu",21,"adilet@gmail.com",2));
//        employeeService.addEmployee(new Employee("Malik","Turatbek uulu",18,"malik@gmail.com",3));
//        employeeService.dropTable();
//        employeeService.cleanTable();
//        employeeService.updateEmployee(1L,new Employee("Manasbek","Kurbanbekov",20,"kurbenbekov@gmail.com",3));
//        System.out.println(employeeService.getAllEmployees());
//        System.out.println(employeeService.findByEmail("malik@gmail.com"));
        System.out.println(employeeService.getEmployeeById(1L));
    }
}
