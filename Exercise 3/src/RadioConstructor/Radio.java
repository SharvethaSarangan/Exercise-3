package RadioConstructor;

import java.util.Scanner;

public class Radio {
	
	String model;
	String colour;
	String shellmaterial;
	double bluetoothversion;
	double weight;

	Scanner r = new Scanner(System.in);
	//default constructor
	//Radio r = new Radio();
	Radio() {
		
		System.out.println("Enter radio model");
		this.model = r.nextLine();
		r.nextLine();
		System.out.println("Enter radio colour");
		this.colour = r.nextLine();
		r.nextLine();		
		System.out.println("Enter shellmaterial");
		this.shellmaterial = r.nextLine();
		r.nextLine();
		System.out.println("Enter the bluetooth version");
		this.bluetoothversion = r.nextDouble();
		r.nextLine();
		System.out.println("Enter weight of the radio");
		this.weight = r.nextDouble();
				
	}
	
	
	//Parameterized constructor
	Radio(String m, String c, String s , double d , double w){
			this.model= m;
			this.colour= c;
			this.shellmaterial= s;
			this.bluetoothversion = d;
			this.weight = w;
	}
	
}

