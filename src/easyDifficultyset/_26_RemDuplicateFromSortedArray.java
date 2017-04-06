package easyDifficultyset;

import java.util.Arrays;
import java.util.Scanner;

public class _26_RemDuplicateFromSortedArray {

	/*Given a sorted array, remove the duplicates in place such that each element 
	appear only once and return the new length.

			Do not allocate extra space for another array, you must do this in place 
			with constant memory.

			For example,
			Given input array nums = [1,1,2],

			Your function should return length = 2, with the first two elements of nums 
			being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int len=0;
		
		while(flag){
			System.out.print("Enter the length of the array ");
			len=sc.nextInt();
			int arr[]=new int[len];
			System.out.println("Enter the array elements");
			for (int i = 0; i < len; i++) {
				arr[i]=sc.nextInt();
			}
			//System.out.println("(Solution:1) The new length is : "+removeDuplicates1(arr));
			System.out.println("(Solution:2) The new length is : "+removeDuplicates2(arr));
			System.out.println("Want to continue: Yes: '1' and No: '0' :");
			if(sc.nextInt()!=1) flag=false;
		}
		sc.close();
	}
	//solution 1 
		public static int removeDuplicates1(int[] nums) {
	        
			int count=0,len,temp;
			len=nums.length;
			for(int i=1;i<len;i++){
				if(nums[i]==nums[i-1]){
					temp=nums[len-1];
					nums[len-1]=nums[i];
					nums[i]=temp;
					--len;
					Arrays.sort(nums, 0, len);
					--i;
					++count;
				}
			}
			System.out.println("(Soln1) Now the array elements are: ");
			for (int i : nums) {
				System.out.print(i);
			}
			return nums.length-count;
	    }
		//solution 2
		public static int removeDuplicates2(int[] nums) {
	        
			int count=0,len,temp,j;
			len=nums.length;
			for(int i=1;i<len;i++){
				if(nums[i]==nums[i-1]){
					++count;
					temp=nums[i];
					
					for(j=i;j<len-1;j++){
						nums[j]=nums[j+1];
					}
					--len;
					nums[j]=temp;
					--i;
				}
			}
			System.out.println("(Soln1) Now the array elements are: ");
			for (int i : nums) {
				System.out.print(i);
			}
			return nums.length-count;
	    }
}
