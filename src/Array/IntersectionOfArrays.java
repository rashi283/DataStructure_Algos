package Array;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by rashiaa on 8/2/16.
 *
 * 349. Intersection of Two Arrays  QuestionEditorial Solution  My Submissions
 Total Accepted: 33987
 Total Submissions: 76524
 Difficulty: Easy
 Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.

 input: [54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,
 38,21,55,37,4,67,64,86,45,33,41]
 [17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,
 90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,
 33,80,20]

 expected:    [18,73,59,89,84,48,54,62,67,27,60,0,61,94,55,   76,35,   28,4,9,86,12,   41,21,65,33]
 output wrong:[18,73,59,      48,54,62,67,27,60,0,61,94,55,60,76,35,84,28,4,9,86,12,89,41,21,65,33]
 18, 73, 59, 54, 62, 67, 27, 60, 0
 *
 */
public class IntersectionOfArrays {
    public static void main(String args[]) {
        //int[] nums1 = {1,2,2,1};//{2,1};//{1};//{1,2,2,1};
        int[] nums1 = {54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,
                       61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41};
        //int[] nums2 = {2,2};//{1,2};//{1};//{1,1};//{2,2};
        int[] nums2 = {17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,
                       67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,
                       2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i: nums1){
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i: nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int i=0;
        for(int n: set2){
            result[i++] = n;
        }

        return result;
    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//
//        ArrayList<Integer> result = new ArrayList<Integer>();
//
//        if(nums1.length>=nums2.length){
//
//            for(int i=0; i < nums1.length; i++){
//                for(int j=0; j < nums2.length; j++){
//                    if(nums1[i]==nums2[j]) {
//                        result.add(nums1[i]);
//                    }
//                }
//            }
//            //System.out.println("result before removal: " + result);
//        }
//        else{
//            for(int i=0; i < nums2.length; i++){
//                //System.out.println("i :" + i);
//                for(int j=0; j < nums1.length; j++){
//                    //System.out.println("j: " + j);
//                    if(nums2[i]==nums1[j]) {
//                        result.add(nums2[i]);
//                    }
//                }
//                //System.out.println(nums2[i]);
//            }
//        }
//        System.out.println(result);
//        for(int k=0; k<result.size(); k++){
//            //System.out.println(result.get(k));
//            for(int j=0; j<result.size(); j++)
//                if(result.get(k)==result.get(j) & k!=j){
//                    //System.out.println("result at k: " + result.get(k));
//                    //System.out.println("result at j: " + result.get(j));
//                    result.remove(j);
//                }
//        }
//        for(int k=0; k<result.size(); k++){
//            //System.out.println(result.get(k));
//            for(int j=0; j<result.size(); j++)
//                if(result.get(k)==result.get(j) & k!=j){
//                    //System.out.println("result at k: " + result.get(k));
//                    //System.out.println("result at j: " + result.get(j));
//                    result.remove(j);
//                }
//        }
//        for(int i =0; i<result.size()-1; i++)
//            if(result.get(i)==result.get(i+1))
//                result.remove(i+1);
//        System.out.println(result);
//        int length = result.size();
//        int[] intResult = new int[length];
//        for(int i=0; i<result.size();i++)
//            intResult[i] = result.get(i);
//        return intResult;
//    }
}
