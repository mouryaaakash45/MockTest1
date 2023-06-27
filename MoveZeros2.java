//  Move Zeros Example 2
package MockTest;

import java.util.Arrays;

public class MoveZeros2 {
    public static void main(String[] args) {
        int[] nums = {0};
           moveZeros(nums);
           System.out.println("Result: " + Arrays.toString(nums));
       }

       public static void moveZeros(int[] nums) {
           int index = 0; // Index to keep track of the current position

           // Move non-zero elements to the left
           for (int num : nums) {
               if (num != 0) {
                   nums[index] = num;
                   index++;
               }
           }

           // Fill the remaining positions with zeros
           while (index < nums.length) {
               nums[index] = 0;
               index++;
           }

   }
}
