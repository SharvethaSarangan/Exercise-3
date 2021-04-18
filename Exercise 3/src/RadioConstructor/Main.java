package RadioConstructor;

public class Main {

	public static void main(String[] args) {
			
			Radio r = new Radio();
			System.out.println("Model Colour Shellmaterial Bluetoothversion Weight : " + r.model + " " + r.colour + " " + r.shellmaterial + " " + r.bluetoothversion + " " + r.weight);
			
			Radio rr= new Radio("S173", "BLUE", "Plastic" , 5.0 , 41.0);
			System.out.println("Model Colour Shellmaterial Bluetoothversion Weight : " + rr.model + " " + rr.colour + " " + rr.shellmaterial + " " + rr.bluetoothversion +" " + rr.weight);
	}

}
