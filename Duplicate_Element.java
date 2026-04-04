package ARRAY_Example;

public class Duplicate_Element {
	public static void main(String args[]) {
		int a[] = {1,2,5,5,6,6,7,2};
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if( ( a[i]==a[j]) && (i!=j)) {
					System.out.println("Duplicate Element " + a[j]);
				}
			}
		}
			


	}

}
