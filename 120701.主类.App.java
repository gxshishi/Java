package java120701;


public class App {
	    public static void main(String[] args) {
	        int [][]array2d={
	                {1,2,3,4,5},
	                {7,8,9,1,1,0},
	                {7,8,9,10,11,12},
	                {7,8,9,10,11,12,9},
	                {88,66,92,102,151,67}
	        };
	        new Find().findZero(array2d);
	        new Find().findLeft(array2d);
	        new Find().findRight(array2d);
	        new Find().findUp(array2d);
	        new Find().findDown(array2d);

	    }
	}


