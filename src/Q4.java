public class Q4 {

   // Write a java program to find the duplicate words and their number of occurrences in the string.
   public static void main(String[] args) {
       String input = "Google is the most popular search engine in the world. Bing comes at number two.";

       input = input.toLowerCase();

       String[] words = input.split(" ");
       int length = words.length;

       for( int i=0; i < length; i++)
       {
           // Set count to 1 for every iteration
           int count = 1;
           for(int j=i+1; j < length; j++)
           {
               if(words[i].equals(words[j]))
               {
                   count++;
                   words[j] = "0";
               }
           }
           if (words[i] != "0" && count > 1)
               System.out.print(" "+words[i]+" ");
       }
   }


}
