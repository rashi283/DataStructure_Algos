package Array;

import java.util.Scanner;

/**
 * Created by rashiaa on 8/4/16.
 * 242. Valid Anagram  Question
 * Editorial Solution  My Submissions
 Total Accepted: 99157
 Total Submissions: 229283
 Difficulty: Easy
 Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.

 Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?
 *
 */
public class ValidAnagram {
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        else{

        }
        return true;
    }
}
