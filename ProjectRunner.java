<<<<<<< main
public class ProjectRunner {
	public static void main(String [] args)
    {
        perfectSquare perfectsquare = (int x) ->
        {
	    	double sqrt = (double)Math.sqrt(x);
	    	return sqrt-(int)sqrt==0;
	    };
	    System.out.println(perfectsquare.square(100));
    }
	interface perfectSquare{
		boolean square(int x);
	}
=======
public class ProjectRunner{ 
    public static void main(String [] args){
        Quotient d= (a,b) -> System.out.printf("Number is approximately %.5f", a/b);
        d.divide(5.2988f,5.0032f);
        System.out.println();
    }
    interface Quotient{
        void divide(float a, float b);
    }         
>>>>>>> Print quotient runner and interface created
}