package easyDifficultyset;

import java.util.Arrays;
import java.util.Scanner;

public class _136_SingleNumber {

	/*	Given an array of integers, every element appears twice except for one. 
	Find that single one.

	Note:
	Your algorithm should have a linear runtime complexity.
	Could you implement it without using extra memory?
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int len;
		while(flag){
			System.out.print("Enter the array size: ");
			len=sc.nextInt();
			System.out.println("Enter the Integer array: ");
			int arr[]=new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("The only integer that does not occur twice is "+singleNumber(arr));
			System.out.println("Want to continue: yes:1 no:0 :");
			if(sc.nextInt()!=1) flag=false;
		}
		sc.close();
	}
	public static int singleNumber(int[] nums) {
        
		Arrays.sort(nums);
		int sint=-1,j=0;
		while(j<nums.length){
			if(j+1>=nums.length){
				return nums[j];
			}else if(nums[j]==nums[j+1]){
				j+=2;
			}else{
				sint=nums[j];
				++j;
			}
		}
		return sint;
    }
}
