package oopspractise;

abstract class Vehicle{
	public abstract int getNoOfWheels();
}
  class Bus extends Vehicle{
	  public int  getNoOfWheels() {
		  return 6;
	  }
	
  }
  class Auto extends Vehicle{
	  public int  getNoOfWheels() {
		  return 4;
	  }
	

}

  