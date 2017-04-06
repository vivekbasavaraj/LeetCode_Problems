package mediumDifficultyset;

import java.util.HashMap;
import java.util.Scanner;

public class _167_TwoSum2 {

/*	Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
	Please note that your returned answers (both index1 and index2) are not zero-based.

	You may assume that each input would have exactly one solution.

	Input: numbers={2, 7, 11, 15}, target=9
	Output: index1=1, index2=2
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the length of the array: ");
			int len = sc.nextInt();
			System.out.println("\nEnter the array elements in ascending order: ");
			int[] arr = new int[len];
			for(int i = 0; i < len; i++){
				arr[i] = sc.nextInt();
			}			
			System.out.print("Enter the target element: ");
			int target = sc.nextInt();
			int[] indices = new int[2];
			indices = twoSum(arr, target);
			System.out.println("1st indice is "+indices[0]+" and 2nd indice is "+indices[1]);
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < numbers.length; i++) {
	        int complement = target - numbers[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement)+1, i+1 };
	        }
	        map.put(numbers[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
