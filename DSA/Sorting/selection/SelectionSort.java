package com.demo.selection;
public class SelectionSort {
	
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,33,9,2,00,1};
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			int smallest = i ;
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[smallest] > arr[j]) {
					int temp = arr[smallest] ; 
					arr[smallest] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		printArr(arr);
	}
	

}
