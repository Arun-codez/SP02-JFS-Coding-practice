class evenstring {
    public static void printWords(String s)
    {
          for (String w : s.split(" ")){
            if (w.length() % 2 == 0)
                System.out.println(w);
        }
    }
    public static void main(String[] args)
    {
        String s = "hello guys this is ashish";
        printWords(s);
    }
} 