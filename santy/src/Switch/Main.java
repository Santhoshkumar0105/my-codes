package Switch;

interface gamingconsole{
	void up();
	void down();
	void left();
	void right();
}
class packman implements gamingconsole{
	public void up() {
		System.out.println("p up");
	}
   public  void down() {
    	System.out.println("p down");
	}
    public void left() {
    	System.out.println("p left");
    }
    public void right() {
    	System.out.println("p right");
    }
}
class Mario implements gamingconsole{
	public void up() {
		System.out.println("m up");
	}
	public void down() {
    	System.out.println("m down");
	}
	public void left() {
    	System.out.println("m left");
    }
	public void right() {
    	System.out.println("m right");
    }
}
class cantro implements gamingconsole{
	public void up() {
    	System.out.println("c up");
	}
	public void down() {
    	System.out.println("c down");
    }
	public void left() {
    	System.out.println("c left");
    }
	public void right() {
    	System.out.println("c right");
    }
}
class gamerun{
	
	void rungame(Mario m) {
		m.up();
		m.down();
		m.left();
		m.right();
	}
	
}
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gamerun obj = new gamerun();
		Mario m = new Mario();
		obj.rungame(m);
		
		

	}

}
