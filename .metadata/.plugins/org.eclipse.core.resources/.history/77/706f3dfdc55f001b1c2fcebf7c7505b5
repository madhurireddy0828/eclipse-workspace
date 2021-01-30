package Cache;


	
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Basics.Employee;
import Basics.HibernateUtil;

	public class TestGetEmployee {

		public static void main(String[] args) {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			
			Session session = sf.openSession();
			
			System.out.println("*******SESSION1 OPNED********");

			System.out.println("****call load method ****");
			Employee emp = (Employee) session.load(Employee.class, 31);
			System.out.println(emp);

			System.out.println("****call load method ****");
			Employee emp1 = (Employee) session.load(Employee.class, 31);
			System.out.println(emp1);

			
			session.close();

	}
		
	}



