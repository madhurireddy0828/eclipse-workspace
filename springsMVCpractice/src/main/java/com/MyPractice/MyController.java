package com.MyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String handleHello1() {
		return "welcome1";
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("welcome2");
	}

	@RequestMapping(value = "/helloWithData", method = RequestMethod.GET)
	public ModelAndView res1() {

		ModelAndView response = new ModelAndView("response1");

		response.addObject("message", "hi how are you ????, i am from backend");

		return response;
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.GET)
	public ModelAndView hiii() {
		ModelAndView m1 = new ModelAndView("welcome3");

		m1.addObject("message", "hi from welcome 3");

		return m1;
	}

	@RequestMapping(value = "/hello4", method = RequestMethod.GET)
	public ModelAndView hi4() {
		ModelAndView m4 = new ModelAndView("welcome4");
		m4.addObject("message", "surthani lokesh, do always practice");
		return m4;
	}

	@RequestMapping(value = "/hello5", method = RequestMethod.GET)
	public ModelAndView hi5() {
		ModelAndView m5 = new ModelAndView("welcome5");
		m5.addObject("line1", "hi welcome, how are you?");
		m5.addObject("line2", "hi how are you?");
		m5.addObject("line3", "Welcome to the world");
		return m5;
	}

	@RequestMapping(value = "/helloMultiData1", method = RequestMethod.GET)
	public ModelAndView getData() {
		ModelAndView m6 = new ModelAndView("getMulti_Data");
		m6.addObject("fname", "SURTHANI");
		m6.addObject("lname", "LOKESH");
		m6.addObject("age", "26");
		m6.addObject("mail", "surthanilokesh@hotmail.com");
		m6.addObject("phno", "9966449023");
		m6.addObject("city", "Bangalore");
		m6.addObject("state", "Karnataka");
		m6.addObject("country", "India");
		return m6;
	}

	@RequestMapping(value = "/helloMultiData2", method = RequestMethod.GET)
	public ModelAndView map1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fname", "SURTHANI");
		map.put("lname", "LOKESH");
		map.put("age", "26");
		map.put("mail", "surthanilokesh@gmail.com");
		map.put("phno", "9966449023");
		map.put("city", "Nellore");
		map.put("state", "Andhra Pradesh");
		map.put("country", "India");

		return new ModelAndView("getMulti_Data2", map);

	}

	@RequestMapping(value = "/MultiData", method = RequestMethod.GET)
	public ModelAndView map2() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "1001");
		map.put("name", "LOKESH");
		map.put("age", "26 years");
		map.put("uType", "Admin");
		return new ModelAndView("getMulti_Data3", map);
	}

	@RequestMapping(value = "/fruits", method = RequestMethod.GET)
	public ModelAndView fruit() {
		Map<String, Object> flist = new HashMap<>();
		flist.put("f1", "Apple");
		flist.put("f2", "Mango");
		flist.put("f3", "Papaya");
		flist.put("f4", "Watermilon");
		flist.put("f5", "Strawberry");
		flist.put("f6", "Kiwi");
		flist.put("f7", "Orange");

		return new ModelAndView("getFruits", flist);
	}
//send java object from controller to jsp
//employee details 	

	@RequestMapping(value = "/employeeDetails", method = RequestMethod.GET)
	public ModelAndView empObj() {
		ModelAndView emp = new ModelAndView("empResponse");
		Employee e1 = new Employee(1000, "LOKESH", "SURTHANI", 26, 50000);
		emp.addObject("message", "Employee Details");
		emp.addObject("emps", e1);
		return emp;
	}

//send customer object from controller to jsp(java server page)	
//customer details 
	@RequestMapping(value = "/custDetails", method = RequestMethod.GET)
	public ModelAndView customer() {
		ModelAndView cust = new ModelAndView("custResponse");
		Customer c1 = new Customer("Vimala Uppu", 9786543210l, "Bangalore", "karnataka");
		cust.addObject("message", "CUSTOMER DETAILS");
		cust.addObject("cus", c1);
		return cust;

	}

// send student object from controller to java server paga
// student details	
	@RequestMapping(value = "/studDetails", method = RequestMethod.GET)
	public ModelAndView student() {
		ModelAndView stud = new ModelAndView("studResponse");
		Student s1 = new Student("L13ME1010", "SURTHANI", "LOKESH", "MECHANICAL", "VIII SEMISTER");
		stud.addObject("message", "STUDENT DETAILS");
		stud.addObject("stud", s1);
		return stud;

	}

// if conditions in java server page(jsp)
	@RequestMapping(value = "/checkCondition", method = RequestMethod.GET)
	public ModelAndView check() {
		ModelAndView ifcon = new ModelAndView("checkResponse");
		ifcon.addObject("age", 65);
		ifcon.addObject("name", "Lokesh");
		return ifcon;
	}

// if conditions in java server page(jsp)
	@RequestMapping(value = "/checkCondition2", method = RequestMethod.GET)
	public ModelAndView check2() {
		ModelAndView c2 = new ModelAndView("checkResponse2");
		c2.addObject("id", 1001);
		c2.addObject("name", "LOKESH");
		c2.addObject("age", 26);
		return c2;
	}

//for each loop inside java server page
	@RequestMapping(value = "/myTeamMates", method = RequestMethod.GET)
	public ModelAndView team() {
		ModelAndView teams = new ModelAndView("foreach1");
		List<String> names = Arrays.asList("LOKESH", "VIMALA", "VISHNU", "MANISHA", "MADHURI", "DINESH", "HARI TEJA",
				"DHANUSH", "KIRAN SAI", "MUKHESH");
		teams.addObject("message", "MY TEAM MEMBERS");
		teams.addObject("name", names);
		return teams;
	}

// for each loop inside java sever pages
// vegetables list
	@RequestMapping(value = "/vegetableList", method = RequestMethod.GET)
	public ModelAndView vegges() {
		ModelAndView veg = new ModelAndView("foreach2vegges");
		List<String> vegItems = Arrays.asList("Brinjal", "Tomato", "Pumpkin", "Cucumberr", "Ginger", "Potato", "Carrot",
				"BeatRoot", "Cabbiage", "Ladiesfinger", "Drumsticks", "Raddish", "Mint");
		veg.addObject("message", "List of Vegetables");
		veg.addObject("liVeg", vegItems);
		return veg;
	}

// for each loop inside the java server page 
// family names list

	@RequestMapping(value = "/foreach3names", method = RequestMethod.GET)
	public ModelAndView famList() {
		ModelAndView fList = new ModelAndView("foreach3names");
		List<String> names = Arrays.asList("Lokesh", "Jaya", "Janardhana", "Jithu", "Kumari", "Rohini", "Loku",
				"Neelavathi", "Vijaya", "Srilatha");
		fList.addObject("message", "List Of Family Members");
		fList.addObject("name", names);
		return fList;
	}

//Multiple employee object
	@RequestMapping(value = "/multipleEmpObj", method = RequestMethod.GET)
	public ModelAndView empList() {
		ModelAndView emps = new ModelAndView("empObjResponse");
		List<Employee> emps1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Employee e1 = new Employee(1001 + i, "SURTHNI" + i, "LOKESH" + i, 26, 50000 + i);
			emps1.add(e1);
		}
		emps.addObject("message", "Employees List");
		emps.addObject("eList", emps1);
		return emps;
	}

//Multiple Student Objects
	@RequestMapping(value = "/multiStudentObj", method = RequestMethod.GET)
	public ModelAndView stds() {
		ModelAndView stdList = new ModelAndView("studObjResponse2");
		List<Student> stud = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s1 = new Student("L13ME1010", "LOKESH", "SURTHANI", "MECHANICAL", "VI SEMESTER");
			stud.add(s1);
		}
		stdList.addObject("message", "Students list");
		stdList.addObject("student", stud);
		return stdList;
	}

	// Multi customers objects
	@RequestMapping(value = "/multiCustomerObj", method = RequestMethod.GET)
	public ModelAndView customer2() {
		ModelAndView cust = new ModelAndView("custObjResponse2");
		List<Customer> cust1 = new ArrayList<Customer>();
		for (int i = 0; i < 10; i++) {
			Customer c1 = new Customer("Vimala Uppu" + i, 9786543210l + i, "Bangalore" + i, "karnataka" + i);
			cust1.add(c1);
		}
		cust.addObject("message", "CUSTOMER DETAILS");
		cust.addObject("cus", cust1);
		return cust;

	}

//Registration Form:
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register1(@RequestParam("employee_id") String empId, @RequestParam("first_name") String fname,
			@RequestParam("last_name") String lname, @RequestParam("password") String pw,
			@RequestParam("age") int age) {
		ModelAndView m1 = new ModelAndView("readDetails");
		String data = "ID = " + empId + "; First Name" + fname + "; Last Name" + lname + "; Password" + pw + "; Age"
				+ age;
		m1.addObject("myData", data);
		return m1;
	}

// Registration form 2
	@RequestMapping(value = "/register2", method = RequestMethod.GET)
	public ModelAndView register2(@RequestParam("lgName") String logName, @RequestParam("fName") String frName,
			@RequestParam("lName") String laName, @RequestParam("age") int age, @RequestParam("password") String pwd) {
		String data2 = "LOGIN NAME :" + logName + "FIRST NAME :" + frName + "LAST NAME :" + laName + "AGE :" + age
				+ "PASSWORD :" + pwd;
		return new ModelAndView("readDetails", "myData", data2);
	}

// Registration form 
	@RequestMapping(value = "/register3", method = RequestMethod.POST)
	public ModelAndView register3(@RequestParam("lgName") String logName, @RequestParam("fName") String frName,
			@RequestParam("lName") String laName, @RequestParam("age") int age, @RequestParam("password") String pwd) {
		String data2 = "LOGIN NAME :" + logName + "FIRST NAME :" + frName + "LAST NAME :" + laName + "AGE :" + age
				+ "PASSWORD :" + pwd;
		return new ModelAndView("readDetails", "myData", data2);
	}

}
