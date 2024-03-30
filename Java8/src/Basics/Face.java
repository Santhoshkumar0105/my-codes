package Basics;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface subin
{
	void add();
}
class ram
{
	static int display(int num)
	{
		return num*num;
	}
}

public class Face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=Arrays.asList(1,6,3,5,7,9,8,4);
		List<Integer> al1=al.stream()
				.map(ram ::display)
			
				.collect(Collectors.toList());
		System.out.println(al1);

	}

}
