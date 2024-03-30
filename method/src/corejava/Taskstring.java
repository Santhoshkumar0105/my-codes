package corejava;

public class Taskstring {

	public static void main(String[] args) {
		String s= "my name is santhosh";
		int le=0;
		for(char al:s.toCharArray()) {
			
			le++;
		}
		System.out.println(le);
		System.out.println(s.length());
		int a=0;
		int l=0;
		while(true) {
			
     try {
    	 s.charAt(a);
         a++;
		
	} catch (Exception e) {
		break;
        			
		}
     
	}
		System.out.println(a);
	}

}
