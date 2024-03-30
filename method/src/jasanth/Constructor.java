/*package jasanth;
class Constructor{
    int point;
    String name;
    Constructor(int mark,String subject){
    point=mark;
    name=subject;
    }
    public void display(){
    System.out.println(point+" "+name);
}
    public static void main(String args[]){
    Constructor s1=new Constructor(40,"tamil");
    Constructor s2=new Constructor(50,"english");
    Constructor s3=new Constructor(60,"maths");
    Constructor s4=new Constructor(65,"science");
    Constructor s5=new Constructor(70,"social");
    s1.display();                                                                               
    s2.display();
    s3.display();
    s4.display();
    s5.display();
    }

}*/
class A{
	int a;
	int b;
	A(){
		System.out.println("no ar constructor of class A");
	}
	A(int a,int b){
		System.out.println("constructor with ar of class A");
		
	}
}
class B extends A{
	int c;
	int d;
	B(){
		super();
		System.out.println(" no ar constructor of class B");
	}
	B(int c,int d){
		super(2,4);
		System.out.println("constructor with ar of class B");
		
	}
	

public static void main(String args[]) {
	B ob= new B();
	B ob1=new B(3,5);

}
}
	
