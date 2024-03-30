package Basics;
import java.util.Optional;
public class opts {

	public static void main(String[] args) {
		String s=null;
		System.out.println(s);
		 Optional<String> s1=Optional.ofNullable(null);
	       Optional<String> s2=Optional.of("hii");
	       System.out.println(s1);
	       System.out.println(s1.equals("hii"));
	       System.out.println(s2.get());
           System.out.println(s1.isEmpty());
	       System.out.println(s1.isPresent());
	       s2.ifPresent(w->System.out.println(w+"hello"));
	       System.out.println(s1.orElse("java"));
	       System.out.println(s2.orElse("java"));
	
	}

}
