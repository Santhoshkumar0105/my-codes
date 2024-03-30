package Basics;
import java.util.function.*;

@FunctionalInterface
interface Demo
{
	void sample();
}
@FunctionalInterface
interface Demo1 extends Demo
{
	void sample();
	static void method()
	{
		System.out.println("static method");
	}
	default int method2()
	{
		return 1000;
	}
}
public class chuma {

	public static void main(String[] args) {
		Demo1 d=()->System.out.println("demo");
		d.sample();
		Demo1.method();
		System.out.println(d.method2());
	//	Predicate<Integer>p=a->a<10;
//		System.out.println(p.test(2));
		BiPredicate<Integer,String> p=(i,s)->i<s.length();
		System.out.println(p.test(5,"hello"));
		BiFunction< String, Integer, String> c1=(s1,i1)->s1+i1;
		System.out.println(c1.apply("hello", 8));
		BiConsumer<String, Integer> p1=(j,d1)->System.out.println(j+" "+d1+"class ");
		p1.accept("sant",7);
		Supplier<String> h1=()->"sam";
		UnaryOperator<Integer> s1=s->s;
		System.out.println(s1.apply(655));
		Function<String, String> f=f1->f1;
		System.out.println(f.apply("dad"));
		BiFunction<String,Integer,String> x=(x1,x2)->x1+x2;
		System.out.println(x.apply("nace",2));
		Consumer<String> k=w->System.out. println(w+" ");
		
		
		
		

	}

}
