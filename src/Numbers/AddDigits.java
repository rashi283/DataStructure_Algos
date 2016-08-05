package Numbers;

import java.util.Scanner;

/**
 * Created by rashiaa on 7/27/16.
 * 258. Add Digits  QuestionEditorial Solution  My Submissions
 Total Accepted: 112305
 Total Submissions: 227758
 Difficulty: Easy
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?


 Hint:

 A naive implementation of the above process is trivial. Could you come up with other methods?
 What are all the possible results?
 How do they occur, periodically or randomly?
 You may find this Wikipedia article useful. https://en.wikipedia.org/wiki/Digital_root
 *
 *
 *
 *
 */
public class AddDigits {
    public static void main(String args[]) {
        System.out.println("Enter number: ");
        Scanner s = new Scanner(System.in);
        System.out.println(addDigits(s.nextInt()));
    }
    public static int addDigits(int a){
        //int sum = 0;
        //sum = (a-9) * (int)(Math.floor(a));
        return ( 1 + (a-1) % 9);
    }
}

//    public static int addDigits(int a) {
//        int digits = 0;
//        int sum = 0;
//        int num = a;
//        while (digits >= 0) {
//            digits = (int) (Math.log10(num) + 1);
//            System.out.println("\ndigits:" + digits);
//            if (num%10 ==0) {
//                num = num / 10;
//                System.out.println("inside num %10");
//                continue;
//            }
//            sum = sum + (num % 10);
//            System.out.println("in between here sum is: " + sum);
//            if (sum%10 ==0 & digits<=1){
//                sum = sum /10;
//                System.out.println("inside sum%10, sum now:" + sum);
//                break;
//            }
//            System.out.println("num%10: " + (num % 10));
//            System.out.println("sum: " + sum);
//            if ((num / 10) != 0)
//                num = num / 10;
//            else
//                break;
//            System.out.println("num: " + num);
//        }
//        digits = (int) (Math.log10(sum) + 1);
//        System.out.println("\nNew loop: digits:" + digits);
//        num = sum;
//        int sum1 = sum;
//        sum = 0;
//
//        while (digits >= 0) {
//            digits = (int) (Math.log10(num) + 1);
//            System.out.println("\ndigits:" + digits);
//            if (num%10 ==0) {
//                num = num / 10;
//                continue;
//            }
//            sum = sum + (num % 10);
//            if (sum %10 ==0) {
//                sum = sum / 10;
//                break;
//            }
//            System.out.println("num%10: " + (num % 10));
//            System.out.println("sum: " + sum);
//            if ((num / 10) != 0)
//                num = num / 10;
//            else
//                break;
//            System.out.println("num: " + num);
//        }
//
//        return sum1 + sum;
//    }
//}

//        digits =0;
//        num = sum;
//        while(digits>=0){
//            digits = (int)(Math.log10(num)+1);
//            sum = sum + (num%10);
//            num = num / 10;
//
//        }
//        return sum;

//        if (digits==1)
//            return a;
//        else if (digits==2) {
//            int res = (a/10) + (a%10);
//            if (res==10)
//                return 1;
//            else {
//                res = ((res / 10) + (res % 10));
//                if (res == 10)
//                    return 1;
//                return res;
//            }
//        }
//        else if (digits==3) {
//            int res = (a/100) + ((a/10)%10) + (a%10);
//            if (res==10)
//                return 1;
//            else {
//                res = ((res / 10) + (res % 10));
//                if (res==10)
//                    return 1;
//                return res;
//            }
//        }
//        else
//            return 0;


//        if(a<10)
//            return a;
//        else if (a>9 & a<100) {
//            int res = (a / 10) + (a % 10);
//            if (res>10)
//                res = 1 + (res%10);
//            else if (res==10)
//                res = 1;
//            return res;
//        }
//        else if (a>99 & a<1000) {
//            int res = (a/100) + ((a/10)%10) + (a%10);
//            if (res>10)
//                res = 1 + (res%10);
//            else if (res==10)
//                res = 1;
//            return res;
//        }
//        else
//            return 0;
//    }
//}
