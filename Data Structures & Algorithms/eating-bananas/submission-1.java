class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;  // the intial rate at which monkey eats bananas ... 
        int right = 0;

        for (int pile : piles){
            right = Math.max(pile, right);
        }

        while (left<right){

            int mid = left + (right-left)/2;

            int hours = 0; // hours 

            // lets find the number of hours needed at speed = mid 

            for (int pile : piles){
                hours = hours + (pile/mid);
                if (pile % mid != 0) {
                    hours++;
                }
            }

            // 
            if (hours <= h){  
                right = mid;
            }

            else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
