package Vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Master vehicle = new Master(2010,999,"red");
		
		System.out.println(vehicle.toString());
		
		vehicle.Masterout();
		
		
		bike b = new bike(2010,99,"blue","Sports");
		
		System.out.println(b.toString());
		
		b.bikeout();
		
	}

}
