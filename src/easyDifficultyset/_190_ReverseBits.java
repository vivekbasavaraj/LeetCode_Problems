package easyDifficultyset;

import java.util.Scanner;

public class _190_ReverseBits {

	/*Reverse bits of a given 32 bits unsigned integer.

	For example, given input 43261596 (represented in 
	binary as 00000010100101000001111010011100), return 964176192 
	(represented in binary as 00111001011110000010100101000000).

	Follow up:
	If this function is called many times, how would you optimize it?

	Related problem: Reverse Integer
	*/
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println((int)Math.pow(2, 32));
		System.out.println((int)Math.pow(2, 31));
		int num;
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The integer/input : ");
			num=sc.nextInt();
			System.out.println("The number after reversing bits in "+num+" is "+reverseBits(num));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int reverseBits(int n) {
		Integer x;
		System.out.println(Math.abs(Integer.parseUnsignedInt("2147483648")));		
		int[] binrep=new int[32];
		int j=0, revnum=0;
		for (int i=0;i<binrep.length;i++) {
			binrep[i]=0;
		}
		while(n>1){
			binrep[j]=n%2;
			n/=2;
			++j;
		}
		if(n==1) binrep[j]=1;
		for(int k=31,l=0;k>=0;--k,++l){
			revnum=revnum+(binrep[k]*((int)(Math.pow(2, l))));			
		}
		return revnum;
    }
}
