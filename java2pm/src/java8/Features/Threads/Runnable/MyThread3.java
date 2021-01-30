package java8.Features.Threads.Runnable;
/*Req:
create a thread and start the thread using Runnable interface

solution:
------------------------
create a class implements Runnable interface and provide run method*/

		public class MyThread3 implements Runnable {

		public void run() {
		System.out.println("Thread " + Thread.currentThread() + " is running");
		}
		}


