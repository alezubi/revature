package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
List<Employee> getAllEmployees() throws SQLException;
Employee getEmployeeById(int id) throws SQLException;
boolean addEmployee(Employee employee) throws SQLException;
boolean updateEmployee(Employee employee) throws SQLException;
boolean deleteEmployee(int id) throws SQLException;

Employee updateStatus(Employee employee)throws SQLException;
List<Employee> getPending() throws SQLException;
List<Employee> getApproved() throws SQLException;

boolean updatePassword (Employee employee)throws SQLException;
boolean SubmitRequest (Employee employee)throws SQLException;

Employee login(Employee employee) throws SQLException;

}
