package com.Char_and_String;

public class StringMethods {
    public static void main(String[] args) {
    //String to CharArray
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str = new String(charArray);
        System.out.println(str);
        char start='a';
        System.out.println(start+1);


        //String Methods:
        //1.indexOf(substring)
        String s = "Hello, world!";
        String substring = "world";
        int index = s.indexOf(substring);
        System.out.println(index);
        if (index != -1) {
            System.out.println("Substring found at index " + index);
        } else {
            System.out.println("Substring not found");
        }

        //2.length()
        System.out.println(s.length());

        //3.charAt(int index)
        System.out.println(s.charAt(7));

        //4.substring(int start,int end) and Substring(int begin)
        System.out.println(s.substring(2,5));

        //5.concat(string)
        String st = "Anchal";
        System.out.println(st.concat(" Maurya"));

        //6.equals() to check content of two
        String st1="anchal";
        String st2="ANCHal";
        System.out.println("Are the strings equal? "+st1.equalsIgnoreCase(st2));
        System.out.println("Are the strings equal? "+st.equals(st1));

        //7. replace()
        String sts="hello good morning";
        String s1="morning";
        String s2="night";
        System.out.println(sts.replace(s1,s2));

        //8.toLowerCase() & toUpperCase()
        s = "Hello, World!";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        //9.trim():  removes leading and trailing whitespace characters from a string and returns a new string.
        s="   hey kya chal rha hai  ";
        System.out.println(s.trim());

        //10. startsWith() and endsWith():
        str = "Hello, World!";
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");

        //11.contains(String)
        str = "The quick brown fox jumps over the lazy dog.";
        boolean containsFox = str.contains("fox");

        //12. split()
        str = "apple,banana,cherry";
        String[] fruits = str.split(",");

        //13.isEmpty()
        str = "";
        boolean isEmpty = str.isEmpty(); // true

        //14. replaceFirst(String,newString)
        //the replaceFirst method is a member of the String class,
        // and it is used to replace the first occurrence of a specified substring within a string with another string.
        str="absdkhdsdkahsdk";
        System.out.println(str.replaceFirst("sdk",""));


        String sentence = "Hello world! How are you?";
        String[] words = sentence.split("\\s+"); // Split by one or more whitespaces
        System.out.println(words[0]);
        for (String word : words) {
            System.out.print(word+" ");
        }

        s.toCharArray();
        System.out.println(s);


        //15. compareTo() function To ignore case use campareToIgnoreCase()
        String str1="anchal"; //smallest
        String str2="ujala"; //largest
        System.out.println(str1.compareTo(str2)); //negative:str1 is smallest
        System.out.println(str2.compareTo(str1)); //positive:str2 is largest

    }
}
