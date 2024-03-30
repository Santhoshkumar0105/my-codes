package corejava;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr= "santhosh";
		char[] ch=arr.toCharArray();
		String reversed=" ";
		for(int i=ch.length-1;i>=0;i--) {
			reversed+=ch[i];
		}
		System.out.println(reversed);
		}
}
