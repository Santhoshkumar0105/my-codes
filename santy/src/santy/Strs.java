package santy;
import java.util.Scanner;
public class Strs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!='0')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1&&ch[i]!='0')
			{
				System.out.println(ch[i]+"is repeated"+"times");
			}
		}
				
				
	}

}
