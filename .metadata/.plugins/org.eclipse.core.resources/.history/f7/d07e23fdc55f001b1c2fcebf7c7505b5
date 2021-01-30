package HQL;


	import java.util.List;
	import Basics.HibernateUtil;
	import org.hibernate.Query;
	import org.hibernate.Session;



	
	public class TestNameQuery3 {
	public static void main(String[] args) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	//Query listEmps = s.createQuery("select usersalary from Employee"); //using hql
	Query listEmps = s.getNamedQuery("empSal"); //using named query

	List<Integer> emps = (List<Integer>)listEmps.list();
	for (Integer emp: emps) {
	System.out.println(emp);
	}

	}

	}


