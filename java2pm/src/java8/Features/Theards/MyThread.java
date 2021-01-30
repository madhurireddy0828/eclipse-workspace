package java8.Features.Theards;
/*Req:
create a thread and start the thread using Thread class

solution:
------------------------
create a class extending Thread class and provide run method*/

		public class MyThread extends Thread {
		public void run() {
		System.out.println(Thread.currentThread()+"Hi.. from the thread run method");
		}
		}




