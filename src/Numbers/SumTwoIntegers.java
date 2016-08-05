package Numbers;

import java.util.Scanner;

/**
 * Created by rashiaa on 7/26/16.
 * 371. Sum of Two Integers  QuestionEditorial Solution  My Submissions
 Total Accepted: 17742
 Total Submissions: 34223
 Difficulty: Easy
 Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.
 */
public class SumTwoIntegers {
    public static void main(String args[]) {
        System.out.println("Enter numbers: ");
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter number: ");
        Scanner t = new Scanner(System.in);

        System.out.println(getSum(s.nextInt(), t.nextInt()));
    }
    public static int getSum(int a, int b) {
        if (a>=0 & b>=0) {
            for (int c = 0; c < b; c++)
                a++;
            return a;
        }
        else if(a<0 & b>0) {
            for (int c = 0; c < b; c++)
                a++;
            return a;
        }
        else if (a>0 & b<0) {
            for(int c = 0; c < a; c++)
                b++;
            return b;
        }
        else if (a<0 & b<0){
            for(int c =0; c < -b; c++)
                a--;
            return a;
        }
        else
            return 0;
    }
}
