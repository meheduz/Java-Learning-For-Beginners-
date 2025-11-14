public class Math{
    public static void main(String[] args) {
        // string in Java language
        
        String str1 = "value";
        String str2 = "value"; // str1 and str2 in same pool, using same memory , thats why str1==str2 is true.
        String str3 = new String("value"); // make different object in heap thats why str1==str3 is false.
        System.out.println(str1==str2);// true , checking memory/pool {comparison}
        System.out.println(str1==str3);// false, checking memory/pool {comparison}
        System.out.println(str1.equals(str2));// true, checking value of string  {comparison}
        System.out.println(str2.equals(str3));// true, checking value of string  {comparison}
        System.out.println(String.valueOf(123));// convert int to string
        System.out.println("AB".equalsIgnoreCase("ab"));// Ignoring case order {comparison}
        // Manipulation 
        String str="Abcd";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("#"));
        System.out.println(str.replace('A','b'));
        System.out.println("   abc".trim());// removing white space from string
        System.out.println("Meheduz".toCharArray()); // convert string to array of character 
    }
}