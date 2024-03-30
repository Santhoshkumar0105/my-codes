package santy;                             //calculating the 10 number........

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,12,4,-2,5,8};
		int add=10;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(add ==a[i]+a[j]) 
					System.out.println(a[i]+" + "+a[j]+"="+add);
				
			}
			
		}
	

	}

}
