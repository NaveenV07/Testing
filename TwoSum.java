import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a map to store numbers and their index positions
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array one by one
        for (int i = 0; i < nums.length; i++) {
            // Find out what number we need to reach the target
            int complement = target - nums[i];
            
            // Check if we have already seen this needed number
            if (map.containsKey(complement)) {
                // If yes, return the index of that number and the current index
                return new int[] { map.get(complement), i };
            }
            
            // If no, save the current number and its index for later
            map.put(nums[i], i);
        }
        
        // Return an empty array if no matching pair is found
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int targetValue = 9;
        
        int[] result = findTwoSum(numbers, targetValue);
        
        // This will print indices [0, 1] because 2 + 7 = 9
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
