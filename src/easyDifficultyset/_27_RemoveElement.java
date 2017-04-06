package easyDifficultyset;

import java.util.Arrays;
import java.util.Scanner;

public class _27_RemoveElement {

/*	Given an array and a value, remove all instances of that value in 
	place and return the new length.

			Do not allocate extra space for another array, you must do this 
			in place with constant memory.

			The order of elements can be changed. It doesn't matter what you 
			leave beyond the new length.

			Example:
			Given input array nums = [3,2,2,3], val = 3

			Your function should return length = 2, with the first two 
			elements of nums being 2.
		*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int len=0,val;
		
		while(flag){
			System.out.print("Enter the length of the array ");
			len=sc.nextInt();
			int arr[]=new int[len];
			System.out.println("Enter the array elements");
			for (int i = 0; i < len; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.print("Enter the value to be removed: ");
			val=sc.nextInt();
			System.out.println("(Solution:1) The new length is : "+removeElement1(arr, val));
			System.out.println("(Solution:2) The new length is : "+removeElement2(arr, val));
			System.out.println("Want to continue: Yes: '1' and No: '0' :");
			if(sc.nextInt()!=1) flag=false;
		}
		sc.close();
		
	}
	
	//solution 1 
	public static int removeElement1(int[] nums, int val) {
        
		int count=0,len,temp;
		len=nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			if(nums[i]==val){
				++count;
				while(nums[len-1]==val && i<len-1){
					++count;
					--len;
				}
				temp=nums[len-1];
				nums[len-1]=nums[i];
				nums[i]=temp;
				--len;
			}
		}
		System.out.println("(Soln1) Now the array elements are: ");
		for (int i : nums) {
			System.out.print(i);
		}
		return nums.length-count;
    }
	
	//solution 2
	public static int removeElement2(int[] nums, int val) {
        int tail = 0;
        int waste = nums.length;
        while (tail != waste) {
            if (nums[tail] != val) {
                tail ++;
            } else {
                waste --;
                int temp = nums[waste];
                nums[waste] = nums[tail];
                nums[tail] = temp;
            }
        }
        System.out.println("(Soln2)Now the array elements are: ");
		for (int i : nums) {
			System.out.print(i);
		}
        return tail;
    }
	
}
