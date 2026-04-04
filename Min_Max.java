package ARRAY_Example;

public class Min_Max {
	    public static void main(String[] args) {
	        int[] arr = {2, 5, 8, 190, 3};

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) min = arr[i];
	            if (arr[i] > max) max = arr[i];
	        }

	        System.out.println("Smallest: " + min);
	        System.out.println("Largest: " + max);
	    
	}

}
