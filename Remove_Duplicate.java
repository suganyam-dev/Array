package ARRAY_Example;

public class Remove_Duplicate {
	public static void main(String args[]) {
		int arr[] = {1,2,3,2,6,8,6};
		
		for(int i =0;i<arr.length;i++){
			
			boolean b = false;
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					b = true;
					break;
				}
				
			}
			if(b== false)
				System.out.print(arr[i] + " ");
		}
			
			
		
		
	}

}
