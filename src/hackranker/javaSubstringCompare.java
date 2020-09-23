package hackranker;


public class javaSubstringCompare {


	public static void main(String[] args) {

		String smallest;
        String largest;
        
        String input = "welcometojava";
        int k = 3;

        smallest = largest = input.substring(0, k);

        for (int i = 1; i < input.length() - k + 1; i++) {


            String substr = input.substring(i, i + k);


            if (smallest.compareTo(substr) > 0)


                smallest = substr;


            if (largest.compareTo(substr) < 0)


                largest = substr;


        }
                
        
        System.out.println(smallest + "\n" + largest);
		
	}

}
