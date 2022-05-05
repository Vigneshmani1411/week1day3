package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n=10, firstTerm =0, secondTerm =1;
System.out.println("Fibonacci Series for" +n + "terms: ");

 for (int i = 1; i <=n ; ++i) {
	 System.out.print(firstTerm + ", ");
	 
	 int nextTerm = firstTerm + secondTerm;
	 firstTerm = secondTerm;
	 secondTerm = nextTerm;
	
}

	}

}
