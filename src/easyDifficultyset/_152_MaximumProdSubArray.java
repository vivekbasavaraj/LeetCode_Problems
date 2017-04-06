package easyDifficultyset;

import java.util.Scanner;

public class _152_MaximumProdSubArray {

/*	Find the contiguous subarray within an array (containing at least one number) which has the largest product.

	For example, given the array [2,3,-2,4],
	the contiguous subarray [2,3] has the largest product = 6.
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
			System.out.println("The largest product is "+maxProduct(arr));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int maxProduct(int[] nums) {
		
		int prod=nums[0];
		for (int i=0;i<nums.length-1;++i) {
			if(nums[i]>prod) prod=nums[i];
			int a=1*nums[i];
			for(int j=i+1;j<nums.length;++j){
				a=a*nums[j];
//				System.out.println(a);
				if(a>prod) prod=a;
//				System.out.println("prod: "+prod);
			}
		}
		if(nums[nums.length-1]>prod) prod=nums[nums.length-1];
		
		return prod;
	}
}
