package swapElementinPlace;

public class swapInPlace {
	
	public static void main(String args[]) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int count = 0;
		for (int i = nums.length - 1; i > count; i--) {
			int temp = nums[i];
			nums[i] = nums[count];
			nums[count] = temp;
			count++;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
	}
}
