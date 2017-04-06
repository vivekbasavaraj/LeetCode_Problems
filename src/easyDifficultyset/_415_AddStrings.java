package easyDifficultyset;

import java.util.Scanner;

class _415_AddStrings {

/*	Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

	Note:

	1. The length of both num1 and num2 is < 5100.
	2. Both num1 and num2 contains only digits 0-9.
	3. Both num1 and num2 does not contain any leading zero.
	4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the string num1 : ");
			String num1 = sc.nextLine();
			System.out.print("\nEnter the string num2: ");
			String num2 = sc.nextLine();
			System.out.println("The Sum of the numbers is  "+addStrings(num1, num2));
			System.out.println("Want to continue Yes: '1' or No: '0' :");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
//	solution 1 
	public static String addStrings(String num1, String num2) {
		
		int numint1 = Integer.parseInt(num1);
		int numint2 = Integer.parseInt(num2);
		int sum = numint1+numint2;
//		6913259244
//		7110334
		return Integer.toString(sum);
	}
//	Solution 2
	public static String addStrings1(String num1, String num2) {
        
		if(num1.length()<num2.length()){
			int temp = num2.length()-num1.length();
			for(int i=0;i<temp;i++){
				String ts = "0";
				ts = ts.concat(num1);
				num1 = ts;
			}
		}else if(num1.length()>num2.length()){
			int temp = num1.length()-num2.length();
			for(int i=0;i<temp;i++){
				String ts = "0";
				ts = ts.concat(num2);
				num2 = ts;
			}
		}
		String sum = "";
		String adder = "0";
		for(int i=num1.length()-1;i>=0;i--){
			int digsum = Character.getNumericValue(num1.charAt(i))+Character.getNumericValue(num2.charAt(i))+Character.getNumericValue(adder.charAt(0));
			if(digsum > 9){
				int tempadder = digsum/10;
				adder = Integer.toString(tempadder); 
				String ts = Integer.toString(digsum%10);
				ts = ts.concat(sum);
				sum = ts;
			}else{
				adder = "0";
				String ts = Integer.toString(digsum);
				ts = ts.concat(sum);
				sum = ts;
			}
		}
		if(!adder.equals("0")){
			String ts = adder;
			ts = ts.concat(sum);
			sum = ts;
		}
	
		return sum;
    }
}
