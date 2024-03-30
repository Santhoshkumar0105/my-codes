package Basics;

import java.util.Arrays;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("santhosh","naveen","akash","arun");
		String largestname = names.stream().max((name1,name2)->Integer.compare(name1.length(),name2.length())).orElse(null);
		System.out.println("the largest name is:"+largestname);

	}

}
