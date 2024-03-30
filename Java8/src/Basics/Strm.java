package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Strm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
	//	al.stream().forEach(p->System.out.println(p));
	//	al.stream().filter(p1->p1>10).forEach(w->System.out.println(w));       //filter-->pridecate
	//	List i=al.stream().filter(p1->p1>10).collect(Collectors.toList());     //sorted-->acending orger
	//	System.out.println(i);
		al.stream().map(m->m+10).filter(t->t%2==0).forEach(e->System.out.println(e));
	//	Long l=al.stream().count();                                            //count-->how many al.add()
	//	System.out.println(l);
	//	List ii=al.stream().distinct().collect(Collectors.toList());     //distinct--> it will remove duplicate
	//	System.out.println(ii);
	//	System.out.println(al.stream().reduce((r1,r2)->r1+r2));          //reduce-->Binaryoperator
	//	al.stream().skip(2).forEach(s->System.out.println(s));           //skip--> it skip the first value
	//	al.stream().limit(2).forEach(d1->System.out.println(d1));        //limit-->the limit is(-)
	//	al.stream().distinct().sorted().limit(3).skip(2).forEach(g->System.out.println(g));
    //  System.out.println(al.stream().findAny());
    //  System.out.println(al.stream().findFirst());
    //  System.out.println(al.stream().toArray());
	//	System.out.println(al.stream().anyMatch(x->x!=70));
	//	System.out.println(al.stream().allMatch(h->h==50));
		
	}

}
