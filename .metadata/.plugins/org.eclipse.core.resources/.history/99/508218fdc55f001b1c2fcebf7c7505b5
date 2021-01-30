package HQL;


	
import Basics.Employee;
import java.util.List;
import Basics.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;



public class TestNameQuery1 {
public static void main(String[] args) {
Session s = HibernateUtil.getSessionFactory().openSession();

// Query listEmps = s.createQuery(" from Employee"); //using hql
Query listEmps = s.getNamedQuery("getALLEmps"); // using named query
List<Employee> emps = (List<Employee>)listEmps.list();
for (Employee emp: emps) {
System.out.println(emp);
}
s.close();
}
}


