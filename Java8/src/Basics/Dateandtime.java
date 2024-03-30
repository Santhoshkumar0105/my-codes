package Basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dateandtime {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalTime g=LocalTime.now();
		System.out.println(g);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getMonthValue());
		System.out.println(g.getNano());
		System.out.println(g.PlusMonth(4));

	}

}
