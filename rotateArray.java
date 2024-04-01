import java.util.Arrays;

public class rotateArray {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;  
        }

        k %= nums.length;
        int[] temp = new int[nums.length]; 

        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];  
        }

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            nums[i] = nums[j];  
            j++;
        }

       
        for (int i = 0; i < k; i++) {
            nums[j] = temp[i];
            j++;
        }

      
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        rotate(nums, k);  
        System.out.println("Original array: " + Arrays.toString(nums));
    }
}
