package Numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 171. Excel Sheet Column Number  QuestionEditorial Solution  My Submissions
 Total Accepted: 91504
 Total Submissions: 211312
 Difficulty: Easy
 Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28

 * Created by rashiaa on 8/3/16.
 */
public class ExcelSheetColumnNumber {
    public static void main(String args[]) {
        System.out.println("Enter column letter: ");
        Scanner s = new Scanner(System.in);
        System.out.println(titleToNumber(s.next()));
    }
    public static int titleToNumber(String s) {
        Map<Character, Integer> m1 = createMap();
        int result1 = 0;
        int result =0;
        int j =0;
        for(int i = s.length()-1; i >=0 ; i--){
            result1 = result1 + ( (int)(Math.pow(26,i)) * m1.get(s.charAt(j++)) ) ;
        }
        System.out.println(result1);

        if(s.length()==1)
            result = m1.get(s.charAt(0));
        else if (s.length()==2)
            result = ((int) Math.pow(26, 1) * (m1.get(s.charAt(0))))
                    + m1.get(s.charAt(1));
        else if (s.length()==3)
            result = ((int)(Math.pow(26,2)) * m1.get(s.charAt(0)))
                    +((int)(Math.pow(26,1)) * m1.get(s.charAt(1)))
                    + m1.get(s.charAt(2));
        else if (s.length()==4) {
            result = ((int) (Math.pow(26, 3)) * m1.get(s.charAt(0)))
                    + ((int) (Math.pow(26, 2)) * m1.get(s.charAt(1)))
                    + ((int) (Math.pow(26, 1)) * m1.get(s.charAt(2)))
                    + m1.get(s.charAt(3));
        }
        else if (s.length()==5) {
            result = ((int) (Math.pow(26, 4)) * m1.get(s.charAt(0)))
                    + ((int) (Math.pow(26, 3)) * m1.get(s.charAt(1)))
                    + ((int) (Math.pow(26, 2)) * m1.get(s.charAt(2)))
                    + ((int) (Math.pow(26, 1)) * m1.get(s.charAt(3)))
                    + m1.get(s.charAt(4));
        }


        return result;
    }

    public static Map<Character, Integer> createMap() {
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        int number = 1;
        for(char alphabet ='A'; alphabet <= 'Z'; alphabet++)
            m1.put(alphabet, number++);
        return m1;
    }
}

/*
*       if(s.length()==1)
            result = m1.get(s);
        else if (s.length()==2)
            result = (26 * (m1.get(s.charAt(0)))) + m1.get(s.charAt(1));
        else if (s.length()==3)
            result = ((int)(Math.pow(26,2)) * m1.get(s.charAt(2))) + (26 * m1.get(s.charAt(1))) + m1.get(s.charAt(0));
        else if (s.length()==4) {
            result = ((int) (Math.pow(26, 3)) * m1.get(s.charAt(3))) + ((int) (Math.pow(26, 2)) * m1.get(s.charAt(2))) +
                    (26 * m1.get(s.charAt(1))) + m1.get(s.charAt(0));
        }
        else if (s.length()==5) {
            result = ((int) (Math.pow(26, 4)) * m1.get(s.charAt(4)))
                    + ((int) (Math.pow(26, 3)) * m1.get(s.charAt(3)))
                    + ((int) (Math.pow(26, 2)) * m1.get(s.charAt(2)))
                    + (26 * m1.get(s.charAt(1))) + m1.get(s.charAt(0));
        }
* */
