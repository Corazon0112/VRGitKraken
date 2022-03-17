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
}