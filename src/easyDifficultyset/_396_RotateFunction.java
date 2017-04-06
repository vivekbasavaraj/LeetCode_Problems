package easyDifficultyset;

import java.util.Scanner;

public class _396_RotateFunction {

/*	Given an array of integers A and let n to be its length.

	Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:

	F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].

	Calculate the maximum value of F(0), F(1), ..., F(n-1).

	Note:
	n is guaranteed to be less than 105.

	Example:

	A = [4, 3, 2, 6]

	F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
	F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
	F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
	F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

	So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
	*/
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the length of the array : N = ");
			int n = sc.nextInt();
			System.out.println("\nEnter the Array A integers: ");
			int[] A = new int[n];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}
			System.out.println("The maximum valus of the function is  "+maxRotateFunction(A));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static int maxRotateFunction(int[] A){

		
		return 0;
	}

	//solution 2
	public static int maxRotateFunction1(int[] A){
		int max= 0;
		for(int i=0; i< A.length; i++){	
			int last = A[A.length-1], sum = 0 ;
			for(int j= A.length-1;j>=0;--j){
				sum += A[j]*j;
				if(j!=0){
					A[j] = A[j-1]; 
				}
			}
			if(i==0){
				max = sum;
			}else if(sum>max){
				max = sum;
			}
			A[0] = last; 
		
		}
		return max;
	}
	// solution 3 - Time limit exceeded
	public static int maxRotateFunction2(int[] A) {
        int max = 0, stpt = A.length-1;
		for (int i = 0; i < A.length; i++) {
			int mtp = 0, tempSum = 0;
			for(int j = stpt, k=0; k < A.length;++k){
				tempSum += A[j]*mtp;
				System.out.print(A[j]+"-"+mtp+" ");
				++mtp;
				++j;
				j = j% A.length;
				
				
			}
			if(i==0){
				max = tempSum;
			}else if(tempSum>max){
				max = tempSum;
			}
			stpt -= 1;
			System.out.println("\n"+tempSum+" & "+max);
		}
		
		return max;
    }
}
