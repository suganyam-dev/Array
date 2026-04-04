package ARRAY_Example;

import java.util.Arrays;

public class Ascending {
	public static void main(String args[]) {
		int[] a = {8,2,9,7,33,3,87};
		System.out.println("Before sort : " + Arrays.toString(a));
		int temp =0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After sort ascending : " + Arrays.toString(a));
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After sort descending : " + Arrays.toString(a));
		
		
	}
}



