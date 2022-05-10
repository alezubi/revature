package com.AlejandroZubillaga;

import java.awt.print.PrinterAbortException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection;

    public EmployeeDaoImpl() throws SQLException {
        this.connection = ConnectionFactory.getConnection();

    }


    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String slq = "INSERT INTO employee (name,email) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(slq);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Employee Saved");
        } else
            System.out.println("Oops, Something went wrong");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update employee set name =? where email =? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if (count == count) {
            System.out.println("Info Updated!");
        } else {
            System.out.println("Opss something went wrong");
        }


    }

    @Override
    public void deleteEmployee(int id) throws SQLException {

        String sql = "delete from employee where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();

        if(count==count){
            System.out.println("Info Deleted");
        }else {
            System.out.println("Oops something went wrong");
        }


    }

    @Override
    public List<Employee> getEmployee() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "Select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);

            Employee employee = new Employee(id, name, email);

            employees.add(employee);

        }
        return employees;
    }

    @Override
    public Employee getEmployeeByID(int id) throws SQLException {
        String sql = "Select * from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            System.out.println("id:" + resultSet.getInt(1) + " name:" + resultSet.getString(2) + " email:" + resultSet.getString(3));
        }

        return null;
    }





}

