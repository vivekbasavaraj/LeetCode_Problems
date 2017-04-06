package mediumDifficultyset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class _442_FindDuplicatesArray {

/*	Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

	Find all the elements that appear twice in this array.

	Could you do it without extra space and in O(n) runtime?

	Example:
	Input:
	[4,3,2,7,8,2,3,1]

	Output:
	[2,3]
			*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The length of the array : ");
			int len=sc.nextInt();
			System.out.println("Enter The elements of the array : ");
			int[] nums=new int[len];
			for(int i=0;i<len;i++){
				nums[i]=sc.nextInt();
			}
			System.out.println("The numbers disappeared are : "+findDisappearedNumbers(nums));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	//solution 1 
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> disNums = new ArrayList<Integer>();
		for (Integer i : nums) {
			if(map.containsKey(i)){
//				int temp = map.get(nums[i]);
//				map.replace(nums[i], ++temp);
				disNums.add(i);
			}else{
				map.put(i, 1);
			}
			
		}
//		for(int i = 0 ; i<nums.length; i++ ){
//			if(map.containsKey(nums[i])){
////				int temp = map.get(nums[i]);
////				map.replace(nums[i], ++temp);
//				disNums.add(nums[i]);
//			}else{
//				map.put(nums[i], 1);
//			}
//			
//		}
		return disNums;
		
	}
	//solution 2 - 86 ms 
	public static List<Integer> findDisappearedNumbers1(int[] nums) {
	        
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> disNums = new ArrayList<Integer>();
		for(int i = 1 ; i<=nums.length; i++ ){
			map.put(i, 0);
		}
		for(int i = 0 ; i<nums.length; i++ ){
			int temp = map.get(nums[i]);
			map.replace(nums[i], ++temp);
		}
		for(int i = 1; i<=nums.length;i++ ){
			if(map.get(i)==2){
				disNums.add(i);
			}
		}
		return disNums;
		
	}
}
