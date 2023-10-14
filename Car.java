package coreJavaAug;
import java.util.Scanner;

class Car extends Vehicle {
	  private String modelName = "Mustang";
	  public static void main(String[] args) {
	    Car myFastCar = new Car();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
	}
