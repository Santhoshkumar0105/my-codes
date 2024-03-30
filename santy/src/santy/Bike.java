package santy;     //method overriding.......................
 class Bus {
	void chennai(int purchase) {
		System.out.println("am going in bike");
		
	}
	void chennai(int purcgase, String s) {
		System.out.println("going to purchse");
	}
}
class train extends Bus{
	void chennai(int purchase) {
		System.out.println("am going in train");
	}
	}
class Bike extends train {
	void chennai(int purchase) {
		System.out.println("am going in bus");
	}
	
public static void main(String args[]) {
	Bike ob = new Bike();
	ob.chennai(5);
	ob.chennai(4);
	ob.chennai( 3);
}
	

}
