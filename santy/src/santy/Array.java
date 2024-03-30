package santy;

public class Array {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int c= a.length;
		int b[]= new int[c];
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		b[i]=a[i];
		System.out.println("t "+b[i]);
		}
		
	
	}

}
