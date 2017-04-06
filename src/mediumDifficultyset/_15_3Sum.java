package mediumDifficultyset;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _15_3Sum {

/*	Given an array S of n integers, are there elements a, b, c in S such that 
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

			Note: The solution set must not contain duplicate triplets.

			For example, given array S = [-1, 0, 1, 2, -1, -4],

			A solution set is:
			[
			  [-1, 0, 1],
			  [-1, -1, 2]
			]
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
			List<List<Integer>> triplets = new ArrayList<List<Integer>>();
			triplets = threeSum(arr);
			System.out.println("The triplets set are :\n"+triplets);
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag = false;
			}
		}
		sc.close();
	}
//	solution 1
//	 public static List<List<Integer>> threeSum(int[] nums) {
//	        
//		 List<List<Integer>> listoftriplets = new ArrayList<List<Integer>>();
////		 List<Integer> t = new ArrayList<Integer>();
////		 t.add(1);
////		 t.add(2);
////		 triplets.add(t);
//		 
//		 for(int i=0; i<nums.length-2;i++){
//			 for(int j=i+1; j<nums.length-1;j++){
//				 for(int k=j+1; k<nums.length;k++){
//					 if(nums[i]+nums[j]+nums[k]==0){
//						 int[] temp = {nums[i],nums[j],nums[k]};
//						 Arrays.sort(temp);
//						 List<Integer> triplets = new ArrayList<Integer>();
//						 for(int index = 0; index<temp.length ;++index){
//							 triplets.add(temp[index]);
//						 }
//						 if(!listoftriplets.contains(triplets))
//						 {	
//							 listoftriplets.add(triplets);
//						 }
//					 }
//				 }
//			 }
//		 }
//		 
//		 return listoftriplets;
//	 }

	//solution 2
	public static List<List<Integer>> threeSum(int[] nums){
		
		 List<List<Integer>> listoftriplets = new ArrayList<List<Integer>>();
		 
//		 HashMap<Integer, Integer> map = new HashMap<>();
//		 for(int i=0; i<nums.length;++i){
//			 if(map.containsKey(nums[i])){
//				 int temp = map.get(nums[i]);
//				 map.replace(nums[i], temp+1);
//			 }else{
//				 map.put(nums[i], 1);
//			 }
//		 }
		 Arrays.sort(nums);
		 ArrayList<Integer> PositiveNumber = new ArrayList<Integer>();
		 ArrayList<Integer> NegativeNumber = new ArrayList<Integer>();
		 Boolean zeroflag = false;
		 for(int i=0; i<nums.length; i++){
			 if(nums[i]>0){
				 PositiveNumber.add(nums[i]);
			 }else if(nums[i]==0){
				 zeroflag = true;
			 }else{
				 NegativeNumber.add(nums[i]);
			 }
		 }
		 if(zeroflag){
			 for(int i=0;i<NegativeNumber.size();++i){
				 
				 if(PositiveNumber.contains(NegativeNumber.get(i)*(-1))){
					 List<Integer> triplets = new ArrayList<Integer>();
					 triplets.add(NegativeNumber.get(i));
					 triplets.add(0);
					 triplets.add(PositiveNumber.get(PositiveNumber.indexOf(NegativeNumber.get(i)*(-1))));
					 if(!listoftriplets.contains(triplets))
						 {	
							 listoftriplets.add(triplets);
						 }
				 }
			 }
		 }
		 
		 
		 return listoftriplets;
	}
}
