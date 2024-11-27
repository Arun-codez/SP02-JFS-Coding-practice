public class GetCharacterFromString {

    public static void main(String[] args) {
        
        String str = "Sathyabama";
        int index = 5;
        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } else {
            System.out.println("Invalid index.");
        }
    }
}