 package santy;

public class login {//overriding
	void passward(String s) {
		System.out.println("login successfully");
	}
	void password(String s,int pw) {
		System.out.println("    enter the mail");
	}
}
	class relogin extends login{ 
		void password( String s) {
			if(s.startsWith("@")) {
				System.out.println("password correct login successfully");
			}
					
		}
		public static void main(String args[]) {
		relogin ob = new relogin();
		ob.password("@santhosh");
		}
	}

	
	

	  


