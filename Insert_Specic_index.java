package ARRAY_Example;

import java.util.Arrays;

public class Insert_Specic_index {
	public static void main(String args[]) {
		int a[] = {10,20,30,40,50};
		int index = 2, value = 15;
		System.out.println("Before Insert : " + Arrays.toString(a));
		for(int i= a.length-1;i>index;i--) {
			a[i] = a[i-1];
		}
		a[index] = value;
		System.out.println("After Insert : " + Arrays.toString(a));
	}

}
