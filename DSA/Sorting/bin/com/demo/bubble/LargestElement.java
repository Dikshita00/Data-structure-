package com.demo.bubble;

public class LargestElement {
	
	public static void main(String[] args) {
		
		int arr[]= {6,4,5,3,99};
		 
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		}
	}
		System.out.println("Largest Element is : "+arr[arr.length-1]);
		System.out.println("Smallest Element is : "+arr[0]);

	}
	

}
