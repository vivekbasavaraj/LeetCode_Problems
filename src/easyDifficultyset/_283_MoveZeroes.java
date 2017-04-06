package easyDifficultyset;

import java.util.Scanner;

public class _283_MoveZeroes {

	/*Given an array nums, write a function to move all 0's to the end of it 
	while maintaining the relative order of the non-zero elements.

	For example, given nums = [0, 1, 0, 3, 12], after calling your function,
	nums should be [1, 3, 12, 0, 0].

	Note:
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The length of the array : ");
			int len=sc.nextInt();
			System.out.println("Enter The elements of the array : ");
			int[] arr=new int[len];
			for(int i=0;i<len;i++){
				arr[i]=sc.nextInt();
			}
			moveZeroes(arr);
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static void moveZeroes(int[] nums) {
        
		int eos=nums.length;
		int i=0;
		while(i<eos){
			if(nums[i]==0){
				for(int j=i;j<eos-1;j++){
					nums[j]=nums[j+1];
				}
				nums[eos-1]=0;
				--eos;
			}else ++i;
		}
		for (int k : nums) {
			System.out.println(k);
		}
		
    }
}
