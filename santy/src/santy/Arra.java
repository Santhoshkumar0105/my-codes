package santy;                //max value of array ..................

public class Arra {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
			
		

	}

}
