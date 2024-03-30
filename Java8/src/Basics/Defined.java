package Basics;

import java.util.function.*;

public class Defined {
 
	public static void main(String[] args) {
//		
//		Predicate<String>p=a->a.length()>10;
//		System.out.println(p.test("java"));
//		
//		BiPredicate<Integer, String>p1=(a1,b1)->10>b1.length();
//		System.out.println(p1.test(53, "java"));
//		
//		Function<Integer,String>p2=a2->"sandhosh"+a2;
//		System.out.println(p2.apply(4));
//		
//		BiFunction<Integer, String, String>s1=(s2,s3)->s2+s3;
//		System.out.println(s1.apply(43, "java"));
//		
//		//Consumer<Integer>s1=s2->System.out.println(3);
//		//s1.accept(2);
//		
//		Consumer<String>p3=p4->System.out.println(p4+"consumer");
//		p3.accept("java8");
//		
//		BiConsumer<String, Integer>p5=(p6,p7)->System.out.println(4);
//		p5.accept("java", 32);
//		
//		Supplier<String>p8=()->"hii";
//		System.out.println(p8.get());
		
		
				Predicate<String> s=a->a.length()>10;
				System.out.println(s.test("santhosh"));
				
				BiPredicate<Integer,String> is=(a1,a2)->a1>a2.length();
				System.out.println(is.test(12, "hello"));
				
				Function<Integer,String>si=s1->"sant"+3;
				System.out.println(si.apply(76));
				
				BiFunction<Integer,String,String>sii=(g1,g2)->g1+"san";
				System.out.println(sii.apply(3, "hello"));
				
				Consumer<String>t=t1->System.out.println(t1);
				t.accept("hii");
				
				BiConsumer<Integer, String>iis=(z1,z2)->System.out.println(z1+z2);
				iis.accept(3,"santhosh");
				
				Supplier<Integer> i=()->3;
				i.get();
				
		        UnaryOperator<String> b=b1->b1;
		        System.out.println(b.apply("san"));
		        
		        BinaryOperator<String> f=f1->"san";
				
				
		

	}

}
