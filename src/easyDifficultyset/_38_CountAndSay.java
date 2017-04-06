package easyDifficultyset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class _38_CountAndSay {

	/*The count-and-say sequence is the sequence of integers beginning as follows:
		1, 11, 21, 1211, 111221, ...

		1 is read off as "one 1" or 11.
		11 is read off as "two 1s" or 21.
		21 is read off as "one 2, then one 1" or 1211.
		Given an integer n, generate the nth sequence.

		Note: The sequence of integers will be represented as a string.
		*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int num;
		while(flag){
			System.out.println("Enter the number n : ");
			num=sc.nextInt();
			System.out.println("The sequence is "+countAndSay(num));
			System.out.println("Want to continue: yes:1 no:0 :");
			if((sc.nextInt())!=1) flag=false;
		}
		sc.close();
	}
	public static String countAndSay(int n) {
	  
//		long[] intseq=new long[n];
		String x=" ";
		int i=1;
//		intseq[0]=1;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		if(n==1) return "1";

		while(i<n){
//			long temp=intseq[i-1];
			
			int tdig;
//			int elenum;
			HashMap<Integer, Integer> Hintgs=new HashMap<Integer, Integer>();
//			int[] numseq=new int[1000];
			ArrayList<Integer> tal=new ArrayList<Integer>();
//			int k=0;
			while(!al.isEmpty()){
				tdig=al.remove(al.size()-1);
//				System.out.println("m");
				
				if(Hintgs.containsKey(tdig)){
					int val=Hintgs.get(tdig);
					Hintgs.replace(tdig, val+1);
				}else{
					
					for (int j : Hintgs.keySet()) {
						tal.add(j);
						//numseq[k]=j;
						tal.add(Hintgs.get(j));
//						numseq[++k]=Hintgs.get(j);
//						++k;
					}
					
					Hintgs.clear();
					Hintgs.put(tdig, 1);
				}
				if(al.size()==0){
					for (int j : Hintgs.keySet()) {
						tal.add(j);
//						numseq[k]=j;
						tal.add(Hintgs.get(j));
//						numseq[++k]=Hintgs.get(j);
//						++k;
					}
				}
				
			}
			al.clear();
			int a;
			StringBuilder strNum = new StringBuilder();
			for(int l=tal.size()-1;l>=0;--l){
//				System.out.print(numseq[l]);
				a=tal.remove(l);
				strNum.append(a);
//				strNum.append(numseq[l]);
				if(a!=0) al.add(a);
			}
			
			String s=strNum.toString();
			s=s.replaceFirst("^0+(?!$)", "");
//			for (int m=0;m<s.length();m++) {
//				al.add((int)(s.charAt(m)));
//			}
//			elenum=/*Integer.parseInt(s);*/Long.parseLong(s);
//			intseq[i]=elenum;
//			System.out.println(intseq[i]+" - "+i);
			++i;
			x=s;
//			x=Long.toString(elenum);
//			System.out.println(elenum);
		}
//		System.out.println(Arrays.toString(intseq));
//		String k=Arrays.toString(intseq);
//		k=k.replaceAll("\\[", "").replaceAll("\\]", "");
		
		return x;
   }

}
