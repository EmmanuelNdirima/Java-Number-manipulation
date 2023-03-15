public class FibonacciMethods {
	public static int sumfibonaccievens(int limit) {
	    int Total = 0;
	    int TermOne = 1;
	    int TermTwo = 2;
	    int nextTerm = 0;
	    
	    while (TermTwo <= limit) {
	        if (TermTwo % 2 == 0) {
	        	Total += TermTwo;
	        }
	        
	        nextTerm = TermOne + TermTwo;
	        TermOne = TermTwo;
	        TermTwo = nextTerm;
	    }
	    
	    return Total;
	}
}

