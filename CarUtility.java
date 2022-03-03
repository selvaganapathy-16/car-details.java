package untitled;

import java.util.Scanner;

public class CarUtility {

	public static void main(String[] args) {
		int i=0;
		Car[] ar = createCarDetails();
		int n= ar.length;
		System.out.println("No of Car Details "+ n);
		for(i=0;i<n;i++)
		{
			
			System.out.println("Car Details "+ i+1);
			System.out.println("Car Id "+ar[i].getCarId());
			System.out.println("Model Number "+ar[i].getModelNumber());
			System.out.println("Colour "+ar[i].getColour());
			System.out.println("Transmission Type "+ar[i].getTransmissionType());
			System.out.println("Fuel Type "+ar[i].getFuelType());
			System.out.println("Engine Type "+ar[i].getEngineType());
			System.out.println("Body Type "+ar[i].getBodyType() );
			System.out.println("Engine Displacement "+ar[i].getEngineDisplacement());
			System.out.println("Boot Space "+ar[i].getBootSpace());
			System.out.println("Seat Capacity "+ar[i].getSeatCapacity());
		}
			
		 
	}
	
	
	
	public static Car[] createCarDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of car details to created");
		int n = sc.nextInt();
		int i=0;
		Car[] obj = new Car[n];
		for(i=0;i<n;i++)
		{
			
			System.out.println("Enter Car Id");
			String carId = sc.next();
			System.out.println("Enter Model Number");
			String modelNumber = sc.next();
			System.out.println("Enter Colour");
			String colour = sc.next();
			System.out.println("Enter Transmission Type");
			String transmissionType = sc.next();
			System.out.println("Enter Fuel Type");
			String fuelType = sc.next();
			System.out.println("Enter Engine Type");
			String engineType = sc.next();
			System.out.println("Enter Body Type");
			String bodyType = sc.next();
			System.out.println("Enter Engine Displacement");
			int engineDisplacement = sc.nextInt();
			System.out.println("Enter Boot Space");
			int bootSpace = sc.nextInt();
			System.out.println("Enter Seat Capacity");
			int seatCapacity = sc.nextInt();
			int noofcars = n;
			obj[i] =  new Car(noofcars,carId,modelNumber,colour,transmissionType, fuelType , engineType,bodyType,engineDisplacement,bootSpace,seatCapacity );
			
		}
		
		return obj;
		
		
	}
}