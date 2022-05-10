package com.AlejandroZubillaga;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while(flag){

            System.out.println("********************************");
            System.out.println("Select from the options below");
            System.out.println("********************************");
            System.out.println("PRESS 1: Add Employee");
            System.out.println("PRESS 2: Update Employee");
            System.out.println("PRESS 3: Delete Employee");
            System.out.println("PRESS 4: Get All Employee");
            System.out.println("PRESS 5: Get Employee By ID");
            System.out.println("PRESS 6: Exit");
            System.out.println("********************************");

            int input = scanner.nextInt();


            switch (input){

                case 1: {
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter email");
                    String email = scanner.next();
                    Employee newEmployee = new Employee();
                    newEmployee.setName(name);
                    newEmployee.setEmail(email);

                    dao.addEmployee(newEmployee);
                    break;
                }
                case 2:{
                    System.out.println("UPDATE NEEDED! Please provide the new name");
                    String name = scanner.next();
                    System.out.println("Please provide the old email");
                    String email = scanner.next();
                    Employee newEmployee = new Employee();
                    newEmployee.setName(name);
                    newEmployee.setEmail(email);
                    dao.updateEmployee(newEmployee);
                    break;
                }

                case 3:{
                    System.out.println("Introduce the ID from the user that you want to delete!");
                    int id = scanner.nextInt();
                    dao.deleteEmployee(id);
                    break;
                }

                case 4:{
                    List<Employee> employees = dao.getEmployee();
                    for(Employee employee: employees){
                        System.out.println(employee);
                    }
                    break;

                }

                case 5:{
                    System.out.println("Insert the employee's ID");
                    int id = scanner.nextInt();
                    dao.getEmployeeByID(id);
                    break;

                }

                case 6:{
                    System.out.println("You are done fot today!");
                    System.out.println("Exiting...");
                    flag = false;
                    break;

                }

                default:
                    System.out.println("Choose between 1-6");

            }


        }
    }
}
