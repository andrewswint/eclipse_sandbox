package hackranker;

import java.util.Scanner;

public class javaStringsIntroduction {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
		String A = "test";
		String B = "another test";
		int countA = 0;
		int countB = 0;
        
        for(int i = 0; i < A.length(); i++) {
        	if(A.charAt(i) != ' ') 
        		countA++;
        }
        
        for(int i = 0; i < B.length(); i++) {
        	if(B.charAt(i) != ' ')
        		countB++;
        }
        
        int compare = A.compareTo(B);
                
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
       
       
        System.out.println(countA + countB);
        
        if(compare > 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
        System.out.println(A + " " + B);
	
	}

}
