package java8.Features.Threads.Runnable;

public class TestMyThread3 {
	
		public static void main(String[] args) {
		System.out.println("main: start");

		Thread th = new Thread(new MyThread3());
		th.start();

		System.out.println("main: end");
		}
		}
		// 2 threads are running in parallel.


