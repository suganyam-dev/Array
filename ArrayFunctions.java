package ARRAY_Example;
import java.util.Scanner;

public class ArrayFunctions {
	 static Scanner sc = new Scanner(System.in);
	 static int n;
	 static int arr[];

public static void ArraySize() {
	System.out.println("Enter the size of array : ");
	n = sc.nextInt();
	System.out.println("Array size : " + n );																		
    arr = new int[n];
	
	
}
public  static void getInput() {
	for(int i=0;i<n;i++) {
		System.out.print("arr[" + i + "] : ");
		arr[i] = sc.nextInt();
		}
}
public static void display() {
	for(int i =0;i<n;i++) {
	 System.out.print(arr[i] + " ");
	}
	System.out.println();
}
public static void processArray() {

    String even = "", odd = "", prime = "", palindrome = "", armstrong = "", evenPrime = "";

    for(int num : arr) {

        // Even / Odd
        if(num % 2 == 0)
            even = even + num + " ";
        else
            odd = odd + num + " ";

        // Palindrome
        int temp = num, rev = 0;
        while(temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == num && num > 9)
            palindrome =  palindrome + num + " ";

        // Armstrong
        temp = num;
        int sum = 0;
        while(temp > 0) {
            int d = temp % 10;
            sum += d*d*d;
            temp = temp / 10;
        }
        if(sum == num)
            armstrong =armstrong + num + " ";

        // Prime
        if(num > 1) {
            int f = 0;
            for(int j = 1; j <= num; j++) {
                if(num % j == 0)
                    f++;
            }
            if(f == 2) {
                prime = prime + num + " ";

                // Even Prime
                if(num % 2 == 0)
                    evenPrime = evenPrime + num + " ";
            }
        }
    }
    

    // Final Output
    System.out.println("Odd: " + odd);
    System.out.println("Even: " + even);
    System.out.println("Prime: " + prime);
    System.out.println("Even Prime: " + evenPrime);
    System.out.println("Palindrome: " + palindrome);
    System.out.println("Armstrong: " + armstrong);
    

    
}

	public static void main(String args[]) {
		
		ArraySize();
		getInput();
		display();
		processArray();
		
		
		
	}

}
