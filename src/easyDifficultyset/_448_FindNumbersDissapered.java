package easyDifficultyset;

import java.util.*;

public class _448_FindNumbersDissapered {

/*	Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
    some elements appear twice and others appear once.

	Find all the elements of [1, n] inclusive that do not appear in this array.

	Could you do it without extra space and in O(n) runtime? You may assume the returned list does not 
	count as extra space.

	Example:

	Input:
	[4,3,2,7,8,2,3,1]

	Output:
	[5,6]
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
	public static List<Integer> findDisappearedNumbers(int[] nums) {
	        
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
			if(map.get(i)==0){
				disNums.add(i);
			}
		}
		return disNums;
		
	}
}
