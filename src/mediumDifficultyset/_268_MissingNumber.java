package mediumDifficultyset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _268_MissingNumber {

/*	Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
    find the one that is missing from the array.

	For example,
	Given nums = [0, 1, 3] return 2.

	Note:
	Your algorithm should run in linear runtime complexity. Could you implement it using only constant 
	extra space complexity?
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
			System.out.println("The number missing is : "+missingNumber(nums));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	//solution 1 - 24 ms
	public static int missingNumber(int[] nums) {
        int j=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, 1);
		}
		for(int i = 0; i<=nums.length;i++ ){
			if(!map.containsKey(i)){
				j = i;
				break;
			}
		}
		return j;
    }
}
