package bnuoj;


import java.util.Scanner;

public class Test_1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String line = sc.nextLine();

			Scanner lsc = new Scanner(line);
			String s1 = lsc.next();
			String s2 = lsc.next();
			
			if (s1.equals("0")&&s2.equals("0")){
//				System.out.println("ooo");
				break;
			}
			
			int minLength = s1.length()<s2.length()?s1.length():s2.length();
			int maxLength = s1.length()>s2.length()?s1.length():s2.length();
			
			char[] supp;
			if (maxLength>minLength){
				supp = new char[maxLength-minLength];
				for (int i = 0;i<(maxLength-minLength);i++){
					supp[i]='0';
				}
				
				String suppStr = new String(supp);
				
				if (s1.length()>s2.length()){
					s2 = suppStr + s2;
				} else {
					s1 = suppStr + s1;
				}
			}
			
			


			char[] s_s1 = String.valueOf(s1).toCharArray();
			char[] s_s2 = String.valueOf(s2).toCharArray();
			
			int result = 0;
			int go = 0;
			for (int i = 0;i<maxLength;i++){

				;
				int i_s1 = Integer.valueOf(String.valueOf(s_s1[s1.length() -1 -i]));
				int i_s2 = Integer.valueOf(String.valueOf(s_s2[s2.length() -1 -i]));
				if ((i_s1 + i_s2 + go)>=10){
					result = result + 1;
					go = 1;
				}else{
					go =0;
				}
			}
			
			if (result ==0){
				System.out.println("No carry operation.");
			}else{
				if (result ==1){
					System.out.println("1 carry operation.");
				}else{
					System.out.println(result  + " carry operations.");
				}
			}
			
			
			
		}
	}

}
