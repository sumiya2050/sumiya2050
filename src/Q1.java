public class Q1 {
//    For  1-125, if a number can be divided by 5 print buzz, if by 3 print fuzz.
//    If can be by both 3&5 print fuzzBuzz.

    public static void main(String[] args) {
        for (int i = 0; i <= 125; i++) {
            if (i % 5 == 0) {   // between 1to 125 which is divided by 5 and remainder will be 0
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fuzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) { // this condition is false
                System.out.println("fuzzBuzz");
            } else {
                System.out.println(i);

            }
        }
    }
}