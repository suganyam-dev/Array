package ARRAY_Example;
import java.util.Scanner;
public class Even_Odd_Count {
	public static void main(String args[]) {
		int even =0, odd =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter a["+i+"] value: ");
			a[i] = sc.nextInt();
		}
		for(int element: a) {
			if(element % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Total number of even values : " + even);
		System.out.println("Total number of odd values : " + odd);
	}
	

}
