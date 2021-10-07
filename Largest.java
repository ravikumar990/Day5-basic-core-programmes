/*
*Java Program to Find the Largest Among Three Numbers
*/
public class Largest {

    public static void main(String[] args) {

        int n1 = 12, n2 = 15, n3 = 55;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
