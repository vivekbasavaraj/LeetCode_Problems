package easyDifficultyset;

import java.util.Scanner;

public class _189_RotateArray {

/*	Rotate an array of n elements to the right by k steps.

	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] 
			is rotated to [5,6,7,1,2,3,4].

	Note:
	Try to come up as many solutions as you can, there are at 
	least 3 different ways to solve this problem.
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
			System.out.print("Enter The value of k  : ");
			int k=sc.nextInt();
			rotate(arr, k);
			for(int i=0;i<len;i++){
			System.out.print(" "+arr[i]);
			}
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		//sc.close();
	}
	public static void rotate(int[] nums, int k) {
		int n=nums.length, temp;
		for(int j=0;j<k;j++){
			temp=nums[n-1];
			for(int l=n-1;l>0;l--){
				nums[l]=nums[l-1];
			}
			nums[0]=temp;
		}
		for(int i=0;i<n;i++){
			System.out.println(nums[i]);
		}
    }
}
