package Numbers;

import java.util.Scanner;

/**
 * Created by rashiaa on 8/1/16.
 *
 * 283. Move Zeroes  QuestionEditorial Solution  My Submissions
 Total Accepted: 102728
 Total Submissions: 225431
 Difficulty: Easy

 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 Credits:

 Input: [4,2,4,0,0,3,0,5,1,0]
 Expected Output: [4,2,4,3,5,1,0,0,0,0]
 *
 */
public class MoveZeroes {
    public static void main(String args[]) {
        //int[] nums = {0,1,0,3,12};
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int temp = 0;
        int zeroes = 0;
        System.out.println("{0,1,0,3,12}");
        for(int i=0;i<nums.length-1; i++){
                System.out.println("nums[i]: "+nums[i]);
                System.out.println("nums[j]: "+nums[i+1]);

            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] == 0) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }

            }
            System.out.println("\n" + nums[i]);

        }
        System.out.println("\n" + nums[nums.length - 1 ]);

//        for(int i=0;i<nums.length-1; i++){
//            System.out.println("nums[i]: "+nums[i]);
//            System.out.println("nums[j]: "+nums[i+1]);
//
//            if(nums[i]==0) {
//                temp = nums[i+1];
//                nums[i+1] = nums[i];
//                nums[i] = temp;
//            }
//            System.out.println("\n" + nums[i]);
//
//        }
//        System.out.println("\n" + nums[nums.length - 1 ]);
    }
}


/**
 * LeetCode OJ
 Subscribe
 Problems
 Mock
 Articles
 Discuss
 Book
 rashi283@gmail.com
 283. Move Zeroes
 June 27, 2016 Question Editorial Solution
 Question

 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 Quick Navigation
 Solution
 Approach #1 (Space Sub-Optimal) [Accepted]
 Approach #2 (Space Optimal, Operation Sub-Optimal) [Accepted]
 Approach #3 (Optimal) [Accepted]
 Solution

 This question comes under a broad category of "Array Transformation". This category is the meat of tech interviews. Mostly because arrays are such a simple and easy to use data structure. Traversal or representation doesn't require any boilerplate code and most of your code will look like the Pseudocode itself.

 The 2 requirements of the question are:

 Move all the 0's to the end of array.

 All the non-zero elements must retain their original order.

 It's good to realize here that both the requirements are mutually exclusive, i.e., you can solve the individual sub-problems and then combine them for the final solution.

 Approach #1 (Space Sub-Optimal) [Accepted]

 C++

 void moveZeroes(vector<int>& nums) {
 int n = nums.size();

 // Count the zeroes
 int numZeroes = 0;
 for (int i = 0; i < n; i++) {
 numZeroes += (nums[i] == 0);
 }

 // Make all the non-zero elements retain their original order.
 vector<int> ans;
 for (int i = 0; i < n; i++) {
 if (nums[i] != 0) {
 ans.push_back(nums[i]);
 }
 }

 // Move all zeroes to the end
 while (numZeroes--) {
 ans.push_back(0);
 }

 // Combine the result
 for (int i = 0; i < n; i++) {
 nums[i] = ans[i];
 }
 }
 Complexity Analysis

 Space Complexity : O(n)O(n). Since we are creating the "ans" array to store results.

 Time Complexity: O(n)O(n). However, the total number of operations are sub-optimal. We can achieve the same result in less number of operations.

 If asked in an interview, the above solution would be a good start. You can explain the interviewer(not code) the above and build your base for the next Optimal Solution.

 Approach #2 (Space Optimal, Operation Sub-Optimal) [Accepted]

 This approach works the same way as above, i.e. , first fulfills one requirement and then another. The catch? It does it in a clever way. The above problem can also be stated in alternate way, " Bring all the non 0 elements to the front of array keeping their relative order same".

 This is a 2 pointer approach. The fast pointer which is denoted by variable "cur" does the job of processing new elements. If the newly found element is not a 0, we record it just after the last found non-0 element. The position of last found non-0 element is denoted by the slow pointer "lastNonZeroFoundAt" variable. As we keep finding new non-0 elements, we just overwrite them at the "lastNonZeroFoundAt + 1" 'th index. This overwrite will not result in any loss of data because we already processed what was there(if it were non-0,it already is now written at it's corresponding index,or if it were 0 it will be handled later in time).

 After the "cur" index reaches the end of array, we now know that all the non-0 elements have been moved to beginning of array in their original order. Now comes the time to fulfil other requirement, "Move all 0's to the end". We now simply need to fill all the indexes after the "lastNonZeroFoundAt" index with 0.

 C++

 void moveZeroes(vector<int>& nums) {
 int lastNonZeroFoundAt = 0;
 // If the current element is not 0, then we need to
 // append it just in front of last non 0 element we found.
 for (int i = 0; i < nums.size(); i++) {
 if (nums[i] != 0) {
 nums[lastNonZeroFoundAt++] = nums[i];
 }
 }
 // After we have finished processing new elements,
 // all the non-zero elements are already at beginning of array.
 // We just need to fill remaining array with 0's.
 for (int i = lastNonZeroFoundAt; i < nums.size(); i++) {
 nums[i] = 0;
 }
 }
 Complexity Analysis

 Space Complexity : O(1)O(1). Only constant space is used.

 Time Complexity: O(n)O(n). However, the total number of operations are still sub-optimal. The total operations (array writes) that code does is nn (Total number of elements).

 Approach #3 (Optimal) [Accepted]

 The total number of operations of the previous approach is sub-optimal. For example, the array which has all (except last) leading zeroes: [0, 0, 0, ..., 0, 1].How many write operations to the array? For the previous approach, it writes 0's n-1n−1 times, which is not necessary. We could have instead written just once. How? ..... By only fixing the non-0 element,i.e., 1.

 The optimal approach is again a subtle extension of above solution. A simple realization is if the current element is non-0, its' correct position can at best be it's current position or a position earlier. If it's the latter one, the current position will be eventually occupied by a non-0 ,or a 0, which lies at a index greater than 'cur' index. We fill the current position by 0 right away,so that unlike the previous solution, we don't need to come back here in next iteration.

 In other words, the code will maintain the following invariant:

 All elements before the slow pointer (lastNonZeroFoundAt) are non-zeroes.
 All elements between the current and slow pointer are zeroes.
 Therefore, when we encounter a non-zero element, we need to swap elements pointed by current and slow pointer, then advance both pointers. If it's zero element, we just advance current pointer.

 With this invariant in-place, it's easy to see that the algorithm will work.

 C++

 void moveZeroes(vector<int>& nums) {
 for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.size(); cur++) {
 if (nums[cur] != 0) {
 swap(nums[lastNonZeroFoundAt++], nums[cur]);
 }
 }
 }
 Complexity Analysis

 Space Complexity : O(1)O(1). Only constant space is used.

 Time Complexity: O(n)O(n). However, the total number of operations are optimal. The total operations (array writes) that code does is Number of non-0 elements.This gives us a much better best-case (when most of the elements are 0) complexity than last solution. However, the worst-case (when all elements are non-0) complexity for both the algorithms is same.

 Analysis written by: @spandan.pathak









 Average Rating: 4.67 (9 votes)

 Subscribe
 subscribe for articles.

 Previous Next


 Join the conversation
 Login to Reply
 C
 cui.yingchao commented 3 hours ago
 My code by use of STL is as follows:

 #include <vector>
 #include <iostream>
 #include <algorithm>

 using namespace std;

 class Solution {
 public:
 void moveZeroes(vector<int>& nums) {

 std::vector<int>:: iterator it = remove(nums.begin(), nums.end(), 0);
 int newLen = distance(nums.begin(), it);

 for(int i=newLen; i<nums.size(); i++) {
 nums.at(i) = 0;
 }
 }
 };
 K
 kushao1267 commented 6 days ago
 def movezeros(list):
 b=[]
 for i in list:
 if i:
 b.append(i)
 for j in range(0,list.count(0)):
 b.append(0)
 return b
 LHearen
 LHearen commented last week
 @codingcoder said in Move Zeroes:

 public void moveZeroes(int[] nums) {
 int zeroCptr = nums.length - 1;
 int[] ans = new int[nums.length];
 for(int i = 0;i<nums.length;i++) {
 if(nums[i] != 0) {
 nums[(nums.length - 1) - zeroCptr] = nums[i];
 zeroCptr--;
 }
 }
 for(int i = nums.length - 1 - zeroCptr;i < nums.length;i++) {
 nums[i] = 0;
 }
 }

 }

 Can be better.

 C
 codingcoder commented last week
 Here is a Java solution, what do you think about it guys. its O(1) in terms of space and O(n) in time

 public void moveZeroes(int[] nums) {
 int zeroCptr = nums.length - 1;
 int[] ans = new int[nums.length];
 for(int i = 0;i<nums.length;i++) {
 if(nums[i] != 0) {
 nums[(nums.length - 1) - zeroCptr] = nums[i];
 zeroCptr--;
 }
 }
 for(int i = nums.length - 1 - zeroCptr;i < nums.length;i++) {
 nums[i] = 0;
 }
 }
 }

 B
 bestel commented 2 weeks ago
 My Ruby code. Working fine, but not validated by leetcode.

 Ruby

 def move_zeroes(nums)

 @nums = nums.sort!

 nums.each do |i|
 if i == 0
 nums.push(i, (nums.delete(i)))
 end
 end

 end
 LHearen
 LHearen commented 3 weeks ago
 @hu26 But we're not all the time handling your special cases, as for normal cases, your code will require more operations.

 H
 hu26 commented 3 weeks ago
 @LHearen Please see my code, in the special case, I didn't swap any elements.!!! And that's the point.! :)

 LHearen
 LHearen commented 3 weeks ago
 @hu26 In your special case, it is no need to swap them all. As my previous post suggested we can just fill the remaining part to make the solution easy enough. Besides the article is just a reference, so try not to be so harsh and serious about it. Okay? You're now kind of too particular about it.

 H
 hu26 commented 3 weeks ago
 Consider all non-zeros : 1,2,3,4,5
 not need to swap with themselves.. (sorry for the last post ...missed format)

 void moveZeroes(vector<int>& nums) {
 for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.size(); cur++) {
 if (nums[cur] != 0&&lastNonZeroFoundAt==cur) {
 lastNonZeroFoundAt++;
 } else if(nums[cur] != 0&&lastNonZeroFoundAt!=cur){
 swap(nums[lastNonZeroFoundAt++], nums[cur]);
 }
 }
 }
 LHearen
 LHearen commented last month
 @活泼大汉子 Next time you'd better format your code bracing them between ``` as Markdown does. Now I've done that for you.


 View original thread Load more comments...
 Frequently Asked Questions | Terms of Service



 Copyright © 2016 LeetCode

 Send Feedback
 *
 *
 *
 * */
