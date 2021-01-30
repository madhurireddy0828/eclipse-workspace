package java8.Features.Threads.Runnable;
/*Req:
create a thread and start the thread using anonymous inner claas

solution:
------------------------
Apply anonymous inner claas to start the thread*/

public class MyThreadTest3 {
	

		public static void main(String[] args) throws InterruptedException {
		System.out.println("main : start");

		Runnable r = new Runnable() {
		public void run() {
		System.out.println("Thread " + Thread.currentThread() + " is running");
		}
		};

		Thread th = new Thread(r);
		th.start();

		System.out.println("main :end");
		}

		}
	


