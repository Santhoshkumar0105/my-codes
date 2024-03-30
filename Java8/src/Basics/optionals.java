package Basics;

import java.util.Optional;



public class optionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		//System.out.println(s);
	//	System.out.println(s.equals("hi"));
		Optional<String> s1=Optional.ofNullable(null);
		//System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.orElseGet(()->"orelse"));

	}

}
