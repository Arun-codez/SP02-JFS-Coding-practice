public class reverse{

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
               String str = "hello";

                String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
