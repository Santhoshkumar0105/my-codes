package santy;                    //........eliminating the value in array.........

public class Arry {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5,3,2,89,6,5,4,6,7,68,9,86,5,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
    }
}
