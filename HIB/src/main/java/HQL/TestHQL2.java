package HQL;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import Basics.HibernateUtil;

public class TestHQL2 {
	
	  public static void main(String[] args) {
	   Session sessionObj = HibernateUtil.getSessionFactory().openSession();
			Query query = sessionObj.createQuery("select userName from Employee");
			List<String> names = query.list();
			for (String name : names) {
				System.out.println(name);
			}
			sessionObj.close();
	  
	  }
	}
	  
	  


