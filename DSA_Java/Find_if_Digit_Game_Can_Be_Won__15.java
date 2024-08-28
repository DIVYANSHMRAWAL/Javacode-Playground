//QUESTION-->
//You are given an array of positive integers nums.

// Alice and Bob are playing a game. In the game, Alice can choose either all single-digit numbers or all double-digit numbers from nums, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.

// Return true if Alice can win this game, otherwise, return false.

//ANSWER-->
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigitsum=0;
        int doubledigitsum=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                singledigitsum=singledigitsum+nums[i];
            }
            else if(nums[i]>=10){
                doubledigitsum=doubledigitsum+nums[i];
            }
        }
         if(singledigitsum==doubledigitsum){
         return false;
        }
        return true;
    }
}