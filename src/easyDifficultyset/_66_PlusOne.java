package easyDifficultyset;

import java.util.Scanner;

public class _66_PlusOne {

/*	Given a non-negative number represented as an array of digits, plus one to the number.

	The digits are stored such that the most significant digit is at the head of the list.
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
			nums = plusOne(nums);
			System.out.println("The number plus one is ");
			for (int i : nums) {
				System.out.println(i);
			}
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int[] plusOne(int[] digits) {
    
		int i = digits.length-1;
		digits[i]+=1;
		while(digits[i]==10){
			if(i-1>=0){
				digits[i]=0;
				--i;
				digits[i]+=1;
			}else{
				int[] tempDig = new int[digits.length+1];
				for(int j=digits.length-1; j>=0 ; j--){
					tempDig[j+1] = digits[j];
				}
				tempDig[1] = 0;
				tempDig[0] = 1;
				digits = tempDig;
			}
		}
		return digits;
    }
}
