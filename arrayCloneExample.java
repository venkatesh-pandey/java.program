package venkateshProject;

import java.util.Arrays;

public class arrayCloneExample {
  
	static void printArray(int []arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	
	
	
	public static void main(String[] args) {
		
    int arr[]= new int[5];
    
     arr[0]=12;
     arr[1]=13;
     arr[2]=14;
     arr[3]=15;
     arr[4]=16;
     
     //System.out.println("Orginal Array:- ");
   //  printArray(arr);
     
    // int [] arr_2=arr.clone();
     int [] arr_2=Arrays.copyOf(arr, arr.length);
     //System.out.println("Copy Array:-");
     //printArray(arr_2);
     
     arr_2[0]=0;
     arr_2[1]=0;
     System.out.println("Orginal Array After Changing arr_2 ");
     printArray(arr);
     System.out.println("Copy Array_2 After Changing arr_2 ");
     printArray(arr_2);
     
     
     
     
    }

}
