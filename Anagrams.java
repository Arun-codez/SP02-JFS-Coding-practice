import java.util.*;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "ink";
        String str2 = "kin";
        if (areAnagrams(str1, str2)) {
            System.out.println("the strings are anagrams.");
        } else {
            System.out.println( " the strings are not anagrams.");
        }
    }
}