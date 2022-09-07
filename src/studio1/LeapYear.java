package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    boolean leapYear;
    System.out.println("Year?");
    int year = scan.nextInt();
    leapYear = (((year % 4 )== 0 )&& ((year % 100 )!= 0 ))||( (year % 400) == 0);
    System.out.println(year + " is a leap year: " + leapYear);
	}

}
