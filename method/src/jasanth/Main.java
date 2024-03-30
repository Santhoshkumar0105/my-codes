package jasanth;

public class Main {
	int y=6;
	int u;
	Main(int u){
		this.u=u;
		System.out.println(u);
	}
		Main(String s,int u){
			this(4);
			this.u=u;
			
			System.out.println(s);
		}
			Main(){
				this("uniq",3);
				System.out.println(y+" "+u);
			}
			void add() {
				System.out.println(u);
			}
			void sub() {
				this.add();
			}
			public static void main(String args[]){
				Main ob =new Main();
				ob.sub();
		}
	}


