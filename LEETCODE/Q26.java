public class Q26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int k = 1;
        for(int i = 1;i < nums.length; i++){
            if(nums[i] != nums[k - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int val : nums){
            System.out.print(val + " ");
        }
        return k;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,0,1,1,1,2,2,2,3,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
