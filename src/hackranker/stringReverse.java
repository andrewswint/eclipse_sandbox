package hackranker;

public class stringReverse {

	public static void main(String[] args) {

		String A = "java";
		
		String output = "";
		 
	    for (int i = A.length() - 1; i >= 0; i--) {
	        output = output + A.charAt(i);
	    }
	 
	    
	   System.out.println(output);
	   
	   if (output.equalsIgnoreCase(A)) {
		   System.out.println("Yes");
	   } else {
		   System.out.println("No");
	   }
	}

}
