

public class Q6 {

//    Write 40 Fibonacci numbers with java.

public static void main(String[] args) {
    int a=0,b=1;

  // System.out.println(a+" "+b);
    int c;
    for(int i = 0; i <= 40 ; i++ ){
        c=a+b;
     System.out.println(""+c);
        a=b;
        b=c;
    }
}}