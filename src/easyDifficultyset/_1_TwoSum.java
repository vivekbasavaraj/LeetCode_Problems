package easyDifficultyset;

//import java.util.HashMap;
import java.util.Scanner;

public class _1_TwoSum {

/*	Given an array of integers, return indices of the two numbers such that they add up to a specific target.

			You may assume that each input would have exactly one solution.

			Example:
			Given nums = [2, 7, 11, 15], target = 9,

			Because nums[0] + nums[1] = 2 + 7 = 9,
			return [0, 1].
	*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag=true;
		while(flag){
			System.out.print("Enter the length of the array: ");
			int len = sc.nextInt();
			System.out.println("\nEnter the array elements: ");
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("\nEnter the target element: ");
			int target = sc.nextInt();
			int[] indices = new int[2];
			indices = twoSum(arr, target);
			System.out.println("The indices are "+indices[0]+" and "+indices[1]);
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag = false;
			}
		}
		sc.close();
	}
	//solution 1 
	public static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for(int i=0; i<nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if((nums[i]+nums[j])==target){
					indices[0]=i;
					indices[1]=j;
				}
			}
		}
		return indices;
    }
	//solution 2 Brute Force
	/*public int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}*/
	
	//solution 3 Two Pass Hash Table
	/*public int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}*/
	
	//solution 4 One pass Hash Table
	/*public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}*/
}
