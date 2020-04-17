package Sorting;

import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	   public static void main(String []args){
	        arr.add(10);
	        arr.add(30);
	        arr.add(15);
	        arr.add(4);
	        arr.add(19);
	        arr.add(28);
	        arr.add(13);
	        arr.add(16);
	        arr.add(12);
	        arr.add(17);
	        arr.add(3);
	        
//	        callMergeSort();
	        callQuickSort();
	       
	       
	       
	       
	       
	        
	     }

	private static void callQuickSort() {
		QuickSort mergeSort = new QuickSort();
	       mergeSort.arr = arr;
	       mergeSort.quickSort(0,arr.size()-1);
	       System.out.println(arr);
		
	}

	private static void callMergeSort() {
		MergeSort mergeSort = new MergeSort();
	       mergeSort.arr = arr;
	       mergeSort.mergeSort(0,arr.size()-1);
	       System.out.println(arr);
		
	}
}
