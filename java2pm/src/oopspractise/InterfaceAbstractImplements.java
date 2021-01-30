package oopspractise;

abstract class ServiceProvider implements Interface {

	public void m1() {
	}

	class SubServiceProvider extends ServiceProvider {//If ur doing abstract class we mush provide implementation by using child class
		public void m2() {
		}

	}

}
