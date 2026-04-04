package ARRAY_Example;

public class Jagged_Enhanced_for {
	 

	
	    public static void main(String args[]) {

	        int a[][] = {
	            {10,20,30,40},
	            {10,20,30},
	            {10,20,30,50}
	        };

	        for(int row[] : a) {          // row represents each sub-array
	            for(int value : row) {    // value represents each element
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    
	}

}
