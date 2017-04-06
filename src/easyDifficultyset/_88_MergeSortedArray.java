package easyDifficultyset;

import java.util.Arrays;
import java.util.Scanner;

public class _88_MergeSortedArray {

	/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 
	as one sorted array.

	Note:
	You may assume that nums1 has enough space (size that is greater or equal 
	to m + n) to hold additional elements from nums2. The number of elements 
	initialized in nums1 and nums2 are m and n respectively.
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int l1,l2;
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The length of first array: ");
			l1=sc.nextInt();
			System.out.print("Enter The length of second array: ");
			l2=sc.nextInt();
			int[] arr1=new int[l1+l2];
			int[] arr2=new int[l2];
			System.out.print("Enter The elements of first array: ");
			for(int i=0;i<l1;i++){
				arr1[i]=sc.nextInt();
			}
			System.out.print("Enter The elements of second array: ");
			for(int i=0;i<l2;i++){
				arr2[i]=sc.nextInt();
			}
			merge(arr1, l1, arr2, l2);
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int i=0,j=0;
		for(i=m,j=0;i<m+n&&j<n;i++,j++){
			nums1[i]=nums2[j];
		}
		Arrays.sort(nums1);
		for (int k : nums1) {
			System.out.println(k);
		}
    }
	
	
	/* To Merge two sorted arrays without sort functions*/
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}
}
