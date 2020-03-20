package Projects;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 20, f0 = 0, f1 = 1;

	        for (int i = 0; i <= count; ++i)
	        {
	            System.out.println(i + ": " + f0);

	            int sum = f0 + f1;
	            f0 = f1;
	            f1 = sum;
	        }

	}

}
