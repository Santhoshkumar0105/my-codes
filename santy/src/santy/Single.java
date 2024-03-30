package santy;              //............min & max value of array.................

public class Single {

	public static void main(String[] args) {
		int a[]= {2,3,54,76,84,12,45,11};
		int max=0;
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		for(int i=0;i<a.length;i++){ 
			if((max==a[i])||(min==a[i])){
		}
	 
		  else 
		  { 
			  System.out.println(a[i]); 
			  } 
			}
		 }
}
