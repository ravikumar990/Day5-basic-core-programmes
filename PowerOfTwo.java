/*
*Power Of Two
*
*/
public class PowerOfTwo {
	public static void main(String[] args) {
		int givenNumber =  Integer.parseInt(args[0]);
		int power=1;
		for (int i= 0; i<=givenNumber; i++) {
			power *=2;
			System.out.print("\t"+ power);
		}
		
	}

}
