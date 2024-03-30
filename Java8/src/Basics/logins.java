package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class logins {
  public static void main(String[] args) {
	 
	  ArrayList<Integer> al=new ArrayList<>();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  al.add(40);
	  al.add(50);
      al.stream().forEach(j->System.out.println(j));
    al.stream().filter(q->q>10).forEach(w->System.out.println(w));
    List<Integer> l= al.stream().sorted().collect(Collectors.toList());
    System.out.println(l);
    al.stream().map(m->m+10).filter(t->t%2==0).forEach(e->System.out.println(e));
    long a=al.stream().count();
    System.out.println(a);
    List ll=  al.stream().distinct().collect(Collectors.toList());
	System.out.println(ll);
	System.out.println(al.stream().reduce((r1,r2)->r1+r2));
	//al.stream().limit(2).forEach(s->System.out.println(s));
	//al.stream().skip(2).forEach(s->System.out.println(s));
	al.stream().distinct().sorted().limit(3).skip(2).forEach(y->System.out.println(y));
	System.out.println(al.stream().findAny());
	System.out.println(al.stream().findFirst());
	System.out.println(al.stream().anyMatch(j->j==200));

  }

}
