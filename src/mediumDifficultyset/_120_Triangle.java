package mediumDifficultyset;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;
public class _120_Triangle {

/*	Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

	For example, given the following triangle
	[
	     [2],
	    [3,4],
	   [6,5,7],
	  [4,1,8,3]
	]
	The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
	*/
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the Max length of the triangle: ");
			int lenOfTriangle = sc.nextInt();
			List<List<Integer>> triangle = new ArrayList<List<Integer>>();
			System.out.println("\nEnter the traingle elements: ");
			for(int i=0; i<lenOfTriangle; i++){
				List<Integer> row = new ArrayList<Integer>();
				for(int j=0; j<i+1; j++){
					row.add(sc.nextInt());
				}
				triangle.add(row);
			}
		//	System.out.println(triangle);
			System.out.println("The minimum path sum is : "+minimumTotal(triangle));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static int minimumTotal(List<List<Integer>> triangle) {
        int minsum = 0;
		for (List<Integer> row : triangle) {
			Integer[] rowArray = new Integer[row.size()];
			rowArray = row.toArray(rowArray);
			Arrays.sort(rowArray);
			minsum = minsum + rowArray[0]; 
		}
		return minsum;
    }
}
//[[-1],
//[2,3],
//[1,-1,-3]]  ==== -1