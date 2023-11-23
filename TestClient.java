package springcoreex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//OUTPUT
// Address :: constructor
// Emp :: constructor
// ****************************************************************
// Emp Id: 111
// Emp Name: Pankaj
// Emp Salary: 1000.87
// Door No: A-34-C
// City Name: New Delhi
// State: Delhi 
public class TestClient {
    public static void main(String[] args) {
        // start IOC containet
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("****************************************************************");
      Emp emp = context.getBean("emp",Emp.class);
      System.out.println("Emp Id: " + emp.getEid());
      System.out.println("Emp Name: " + emp.getEname());
      System.out.println("Emp Salary: " + emp.getEsal());
      Address address = emp.getAddress();
    System.out.println("Door No: "+address.getDno());
    System.out.println("City Name: " + address.getCity());
    System.out.println("State: " + address.getState());
    }
}
