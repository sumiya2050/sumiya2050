import java.util.Scanner;
//If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM, DAD, and MADAM are palindromes.
// So write java code to check if a given String is Palindrome or not.
public class Q8 {
   // import java.util.Scanner;
//import java.util.*;
    public static void main(String[] args) {


    String original, reverse = ""; // Objects of String class
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string to check if it's a palindrome");
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1; i >= 0; i--)
    reverse = reverse + original.charAt(i);

    if (original.equals(reverse))
            System.out.println("The string is a palindrome.");
    else
            System.out.println("The string isn't a palindrome.");
}
}

