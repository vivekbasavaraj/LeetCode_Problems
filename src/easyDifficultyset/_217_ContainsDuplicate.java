package easyDifficultyset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _217_ContainsDuplicate {
/*	Given an array of integers, find if the array contains any duplicates.
	Your function should return true if any value appears at least twice 
	in the array, and it should return false if every element is distinct */
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int len=0;
		System.out.println("Enter the length of the array ");
		len=Integer.parseInt(sc.nextLine());
		int[] intset= new int[len];
		for (int i : intset) {
			i=0;
		}
		System.out.println("Enter the array of integers");
		for (int i = 0; i < len; i++) {
			intset[i]=Integer.parseInt(sc.nextLine());
		}
		if (containsDuplicate(intset)) {
			System.out.println("It contains duplicates");
		}else{
			System.out.println("It does not contains duplicates");
		}
		sc.close();
	}
	
	public static boolean containsDuplicate(int[] nums) {
		boolean dup=false;
		List<Integer> newArray = new ArrayList<Integer>(); 
		String temp=String.valueOf(nums[0]);
		newArray.add(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			for (Integer num : newArray) {
				if(num==nums[i]){
					dup=true;
					return dup;			
				}
			} 
			newArray.add(nums[i]);
		}
		return dup;
	}

//	public static boolean containsDuplicate(int[] nums) {
//		boolean dup=false;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if(nums[i]==nums[j]){
//					dup=true;
//				}
//			}
//		}
//		return dup;
//	}
}
