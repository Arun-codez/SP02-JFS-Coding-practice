public class AddCharacterToString {

    public static String addCharacter(String str, char c) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(c); 
        return sb.toString(); 
    }

    public static void main(String[] args) {
        String str = "Hello";

        char charToAdd = '!';
       
        String result = addCharacter(str, charToAdd);
        System.out.println("Resulting string: " + result);
    }
}
