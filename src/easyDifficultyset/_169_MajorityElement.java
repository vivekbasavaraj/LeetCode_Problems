package easyDifficultyset;

import java.util.HashMap;
import java.util.Scanner;

public class _169_MajorityElement {

	/*Given an array of size n, find the majority element. 
	 The majority element is the element that appears more than (n/2 ) times.

	You may assume that the array is non-empty and the majority element 
	always exist in the array.
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
			System.out.println("The majority element in the array is "+majorityElement(arr));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
	     	if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int majorityElement(int[] nums) {
        
		HashMap<Integer, Integer> Hstrs=new HashMap<Integer,Integer>();
		for (int i = 0; i <nums.length; i++) {
			if(Hstrs.containsKey(nums[i])){
				int val=Hstrs.get(nums[i]);
				Hstrs.replace(nums[i], val+1);
			}else{
				Hstrs.put(nums[i], 1);
			}	
		}
		int val=0;
		for(int i=0;i<nums.length;i++){
			if((Integer)Hstrs.get(nums[i])>(Math.floor(nums.length/2))) val=nums[i] ;
		}
		return val;
    }
}
