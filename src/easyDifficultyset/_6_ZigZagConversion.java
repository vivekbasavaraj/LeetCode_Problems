package easyDifficultyset;

import java.util.Scanner;

public class _6_ZigZagConversion {

/*	The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

	P   A   H   N
	A P L S I I G
	Y   I   R
	And then read line by line: "PAHNAPLSIIGYIR"
	Write the code that will take a string and make this conversion given a number of rows:

	string convert(string text, int nRows);
	convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
			*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.println("Enter the String : ");
			String s = sc.nextLine();
			System.out.println("Enter the number of Rows : ");
			int nor = Integer.parseInt(sc.nextLine());
			System.out.println("Zigzag string is : "+convert(s, nor));
			System.out.println("Want to continue Yes: '1' or No: '0' :");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static String convert(String s, int numRows) {
        
		if(numRows==1){
			return s;
		}
		String retstr = "";
		String[] setstr = new String[numRows];
		for (int j=0;j<setstr.length;j++) {
			setstr[j] = "";
		}
		
		int tc = 0;
		Boolean dirFlag = true;
		for(int i=0; i<s.length();i++){
			setstr[tc] = setstr[tc].concat(String.valueOf(s.charAt(i)));
			
//			++tc;
//			if(tc == numRows && (i+1)<s.length()){
//				++i;
//				if(numRows%2 != 0){
//					setstr[numRows/2] =  setstr[numRows/2].concat(String.valueOf(s.charAt(i)));
//				}else{
//					setstr[(numRows/2)-1] =  setstr[(numRows/2)-1].concat(String.valueOf(s.charAt(i)));
//				}
//			}
//			tc = tc%numRows;
			
			if(dirFlag){
				if((tc+1)!=numRows){
					++tc;
				}else{
					--tc;
					if(tc!=0){
						dirFlag = false;
					}
				}
			}else{
				if((tc-1)==0){
					--tc;
					dirFlag = true;
				}else{
					--tc;
				}
			}
			
			
		}
		for (String str : setstr) {
			retstr = retstr.concat(str);
		}
		return retstr;
    }
}
