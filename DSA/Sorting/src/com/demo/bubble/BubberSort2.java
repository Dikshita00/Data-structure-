package com.demo.bubble;

import java.util.Scanner;

public class BubberSort2 {
	
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+ "elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Sorted array : ");
			printArr(arr);
			sc.close();
	}
	}
	

