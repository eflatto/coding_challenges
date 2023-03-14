package codingchallenges;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    private int [] answers = new int[2]; // create an array of size 2 to store the answers
    public int[] twoSum(int[] nums, int target) { // method that takes in an array of integers and a target value
        
        for(int i = 0;i<nums.length;i++){ // loop through each element in the array
            
            for(int j =i+1;j<nums.length;j++){ // loop through each element starting from i+1 (avoiding duplicates)
                if(nums[i]+nums[j]==target){ // check if the sum of two elements equals the target value
                    answers[0]=i; // store the indices of the two elements in the answers array
                    answers[1]=j;
                    return answers; // return the answers array
                }
             }  
           }
        return answers; 
    }
    //time : (O)N
    class Solution {
        public int[] twoSum(int[] nums, int target) {
          Map <Integer,Integer> map = new HashMap<>();
          for(int i=0;i<nums.length;i++){
              int complement = target-nums[i];
              if(map.containsKey(complement)){
                  return new int[]{map.get(complement),i};
              }
              map.put(nums[i],i);
          }
          return null;
    }
        }
}
