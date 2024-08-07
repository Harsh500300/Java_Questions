package Strings;

public class CheckAnagramOrNot {

    public static boolean checkAnagramOrNot(String str, String str1) {
        // Check if lengths of both strings are equal
        if (str.length() != str1.length()) {
            return false;
        }

        // Convert strings to lowercase (assuming case-insensitive anagram check)
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        // Convert strings to character arrays to sort them
        char[] charArray1 = str.toCharArray();
        char[] charArray2 = str1.toCharArray();

        // Sort the character arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare sorted arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str = "Hllo";
        String str1 = "ollH";
        if (checkAnagramOrNot(str, str1)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

}
