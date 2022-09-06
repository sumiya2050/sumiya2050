public class Q7 {
    //Write a Java Program to check if the two String is Anagram.
    // Two String are called Anagram when characters are the same
    // but in a different order. For example, "CAT" and "ACT", "ARMY" and "MARY".
    public static boolean isAnagram(String word, String anagram) {
        word = word.toLowerCase();
        anagram = anagram.toLowerCase();
        if (word.length() != anagram.length()) {
            return false;
        }

        char[] chars = word.toCharArray();

        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }

        return anagram.isEmpty();
    }


    public static void main(String[] args) {
        String str1 = "ARMY";
        String str2 = "MARY";

        if (isAnagram(str1, str2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' is anagram");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' is not anagram");

        }
        String str3 = "CAT";
        String str4 = "ACT";

        if (isAnagram(str1, str2)) {
            System.out.println("'" + str3 + "' and '" + str4 + "' is anagram");
        } else {
            System.out.println("'" + str3 + "' and '" + str4 + "' is not anagram");

        }

    }}
