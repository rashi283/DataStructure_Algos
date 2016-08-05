package Array;

/**
 * Created by rashiaa on 7/26/16.
 * LeetCode 344: Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {

    public static String reverseString(String s){

        String out = "";
        int j = s.length() - 1;
        for(int i=0; i<s.length(); i++)
        {
            out = out + s.charAt(j);
            j--;

        }
        return out;
    }
    public static void main(String args[]){
        System.out.println(reverseString("hello"));
    }
}
