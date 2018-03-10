package easy;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a
 * specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1
 * must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSumII {
    public int[] solve(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (true) {
            int temp = numbers[left] + numbers[right];
            if (temp == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (temp > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
