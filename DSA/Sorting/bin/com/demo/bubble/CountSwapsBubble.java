package com.demo.bubble;

public class CountSwapsBubble {
	
	public static void main(String[] args) {
		
		int arr[]= {4,8,9,0,2,3};
		int swapcount=0;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapcount++;
							
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int num : arr)
			System.out.println(num + " ");
		System.out.println("\n Total Swaps:" + swapcount);
	}

}
