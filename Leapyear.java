/*
* Leap Year
*/
import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
	int year;
	System.out.println("enter an year:");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	if(((year % 4==0) && (year % 100!=0)) || (year % 400 ==0))
	{
		System.out.println("it is a leap year ");
	}
	else
			System.out.println("it is not a leap year ");
	}
	
}
