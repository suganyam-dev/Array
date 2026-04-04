package ARRAY_Example;

public class Sum_Average {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum/ arr.length);
		
	}

}
