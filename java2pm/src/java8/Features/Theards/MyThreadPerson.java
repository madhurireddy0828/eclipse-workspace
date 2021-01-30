package java8.Features.Theards;


		public class MyThreadPerson extends Thread {

		Person person;

		public MyThreadPerson(Person person) {
		super();
		this.person = person;
		}

		public void run() {
		try {
		Thread.sleep(7000);
		person.count = person.count + 5;
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		}


