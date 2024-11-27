public class TestSplitMethod {  
public static void main(String[] args) {  
String str = "Java is a system independent programming language";  
String[] strArray = null;  
strArray = str.split(" ");  
for (int i = 0; i< strArray.length; i++){  
System.out.println(strArray[i]);  
}  
}  
}  