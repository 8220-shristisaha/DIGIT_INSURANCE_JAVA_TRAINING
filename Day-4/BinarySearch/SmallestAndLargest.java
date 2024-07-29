public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 4;
        System.out.println("Smallest : "+smallest(nums,target));
        System.out.println("Largest : "+largest(nums,target));
    }

    private static int smallest(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result=-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                result = nums[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return  result;
    }

    private static int largest(int[] nums, int target) {
        int result=-1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                result = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}