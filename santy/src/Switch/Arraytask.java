package Switch;

public class Arraytask {

	public static void main(String[] args) {
		String a[] = { "santhosh", "kumar", "bala","santhosh", "kumar", "bala", "kumar" };
		int b = 1;
		boolean ok = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j]) && a[j]!="1") {

					b++;
				ok = true;
					a[j]="1";
				}

			}
		
			if (ok) {
				System.out.println(a[i] + " " + b);
				b = 1;
				ok = false;
			}
		}

	}

}
