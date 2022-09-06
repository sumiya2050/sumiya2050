

public class Q2 {
//    Find the list of Prime numbers from number 2 to 1000
    //Prime numbers are numbers that have only 2 factors: 1 and themselves. For example,
    // the first 5 prime numbers are 2, 3, 5, 7, and 11.
    // 2 is a prime number because its only factors are 1 and itself.

    public static void main(String[] args) {
//        int tem=0;
//        for (int no = 2; no<=100; no++){
//
//            for ( int j=2;j<=no-1;j++){
//                if (no%j==0){
//                    tem=tem+1;
//                }
//                if (tem==0){
//                    System.out.println(no);
//                }else { tem=0;
//            }
//        }
//    }}}
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {


                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }}