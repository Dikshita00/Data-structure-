package com.day7.demo.doublylinkedlisttest;

import com.day7.demo.doublylinkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.displayData();
		dlist.addNode(15);
		dlist.addNode(13);
		dlist.displayData();
		
		
	}
	

}
