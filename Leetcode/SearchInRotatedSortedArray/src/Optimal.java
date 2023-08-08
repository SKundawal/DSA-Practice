public class Optimal {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + ((right - left) >> 1);

            if(target == nums[mid]){
                return mid;
                // need to do partitions
            } else if(nums[right] >= nums[mid]){
                if(target <= nums[right] && target >= nums[mid]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if(target >= nums[left] && target <= nums[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
