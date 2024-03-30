package santy;     // ..... methos overloaging ,,,,,,,,,,,,,,,,,,,

class Calander {
	int a,b;
	void call(int a,int b) {
		if(a<b)
		{
		System.out.println(a);
	}
		else {
			System.out.println(b);
		}
		}
	void call(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void call(long d, double e) {
		System.out.println(d+e);
	}
	public static void main(String args[]) {
		Calander obj =new Calander();
		
		obj.call(5,5,5);
		obj.call(1000,100.00);
	}

	

}
