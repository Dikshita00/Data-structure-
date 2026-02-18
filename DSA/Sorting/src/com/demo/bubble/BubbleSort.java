package com.demo.bubble;

public class BubbleSort {
	
	public static void printarr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {43,34,23,32,12,23};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printarr(arr);
	}

}
