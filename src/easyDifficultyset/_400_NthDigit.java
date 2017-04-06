package easyDifficultyset;

import java.util.ArrayList;
import java.util.Scanner;

public class _400_NthDigit {

/*	Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
	Note:
	n is positive and will fit within the range of a 32-bit signed integer (n < 231).

	Example 1:
	Input: 3
	Output: 3
	
	Example 2:
	Input: 11
	Output: 0
	Explanation:
	The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
	*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.println("Enter the n value : ");
			int n = sc.nextInt();
			System.out.println("The nth digit of the indefinite sequence is : "+ findNthDigit(n));
			System.out.println("Want to continue Yes: '1' or No: '0' :");
			if(sc.nextInt()!=1){
				flag = false;
			}
		}
		sc.close();
	}
	//solution 1 
	public static int findNthDigit(int n){
		
		if(n==0){
			return 0;
		}
		int dig = 1;
		int value = 0;
		int digcount = (int) Math.log10(n) + 1;
		for(int i=0;i<n;){
			int temp = dig;
			ArrayList<Integer> tmplst = new ArrayList<Integer>();
			int len = (int) Math.log10(dig) + 1;
			if(i+len >= n){
				while(temp >= 1){
					tmplst.add(temp%10);
					temp = temp/10;
					
				}
				while(!tmplst.isEmpty()){
					if(i+1 == n){
						value =tmplst.remove(tmplst.size()-1);
					}else{
						tmplst.remove(tmplst.size()-1);
					}
					++i;
				}
			}else{
				i = i+len;
			}
			
			++dig;
		}
		return value;
		
	}
	//solution 2 - memory limit exceeded
	public static int findNthDigit1(int n) {
		if(n==0){
			return 0;
		}
		ArrayList<Integer> arlst = new ArrayList<Integer>();
		int dig = 1;
		
		for(int i=0;i<n;){
			int temp = dig;
			ArrayList<Integer> tmplst = new ArrayList<Integer>();
//			int len = (int) Math.log10(dig) + 1;
			while(temp >= 1){
				tmplst.add(temp%10);
				temp = temp/10;
				++i;
			}
			while(!tmplst.isEmpty()){
				arlst.add(tmplst.remove(tmplst.size()-1));
			}
			++dig;
		}
		return arlst.get(n-1);
    }
}
