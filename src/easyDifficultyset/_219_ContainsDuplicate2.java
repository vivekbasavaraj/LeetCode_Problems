package easyDifficultyset;

import java.util.Scanner;

public class _219_ContainsDuplicate2 {

	/*Given an array of integers and an integer k, find out whether there 
	are two distinct indices i and j in the array such that nums[i] = nums[j]
	and the difference between i and j is at most k.
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while(flag){
			System.out.print("Enter the length of the array: ");
			int len=sc.nextInt();
			System.out.println("Enter the array of integers: ");
			int[] arrint=new int[len];
			for(int i=0;i<len;i++){
				arrint[i]=sc.nextInt();
			}
			System.out.print("Enter the Integer k: ");
			int k=sc.nextInt();
			if(containsNearbyDuplicate(arrint, k))
				System.out.println("True: It does contain");
			else
				System.out.println("False: It does not contain");
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		//sc.close();
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]==nums[j] && (j-i<=k)) return true;
			}
		}
		return false;
    }

}
