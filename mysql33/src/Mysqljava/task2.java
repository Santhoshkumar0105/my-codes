package Mysqljava;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] value={"santhosh","naveen","akash"};
		for(int i=0;i<value.length;i++) {
			String a=value[i];
			boolean as=true;
			for(int j=0;j<i;j++) {
				if(a==value[j]) {
					as=false;
					break;
					 
				}
			}
			if(true) {
				int count = 0;
				for(int j=0;j<value.length;j++) {
					if(a.equals(value[j])) {
						count++;
					}
				}
				System.out.println(a+":"+count);
			}
		}
		

	}

}
