
import javax.persistence.Query;
import java.util.List;

import javax.persistence.Query;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {

      //  public static void main( String[] args ) {
public void listEm () throws HibernateException {
                System.out.println("starting project...");


                // create a configuration object
                Configuration config = new Configuration();

                // read the configuration and load in the object
                config.configure("hibernate.cfg.xml");

                // create factory
                SessionFactory factory = config.buildSessionFactory();
                // open the session
                Session session = factory.openSession();
                // begin transaction
                Transaction t = session.beginTransaction();

                Query q = session.createQuery("from Employee");
                List<Employee> employees1 = q.getResultList();


    System.out.println("1-----------------------------------------------------------------");
    System.out.println(employees1.get(1));
    System.out.println("2-----------------------------------------------------------------");
          String unoe = String.valueOf(employees1);
    System.out.println(unoe);
    System.out.println("#-----------------------------------------------------------------");
                for( Employee e:employees1){

                        System.out.println(e);
                }

                Employee employee = new Employee();
                employee =(Employee) session.get(Employee.class,1);
    System.out.println("3-----------------------------------------------------------------");
                t.commit();

                System.out.println(employee);
    System.out.println("4-----------------------------------------------------------------");
                System.out.println(employee.getEmail());
                session.close();
    System.out.println("5-----------------------------------------------------------------");
                //displaye


                // Employee employee = new Employee();
                // employee =(Employee) session.get(Employee.class,1);
                //  t.commit()
                //System.out.println(employee);
                //System.out.println(employee.getEmail());
                //  session.close();





                // create object

                // Employee employee = new Employee();
                // employee.setId(2);
                //employee.setName("yeison");
                //employee.setEmail("m2@gmail.com");
                //  session.save(employee);
                //t.commit();
                //session.close();




                // save the object
                //session.save(employee);
                //session.update(employee);
                //session.delete(employee);


        }

}



