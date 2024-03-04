import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array.add(i);
                    array.add(j);

                }
            }

        }

        int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
    Solution solution= new Solution();

        int [] nums={1,2,3,4};
        int  target= 7;
      int [] result= solution.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    
}

