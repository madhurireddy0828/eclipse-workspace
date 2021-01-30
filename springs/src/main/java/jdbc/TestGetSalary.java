package jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetSalary {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/jdbc/springs.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

		Scanner sc = new Scanner(System.in);

		System.out.print("enter id: ");
		int id = sc.nextInt();

		System.out.println(dao.getSalaryById(id));

	}
}
