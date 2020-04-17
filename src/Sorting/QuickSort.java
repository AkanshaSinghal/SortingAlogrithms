package Sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public static ArrayList<Integer> arr = new ArrayList<Integer>();

	public void quickSort(int start, int end) {
		
		if( start>= end) {
			return;
		}
		
		else {
			int pivot = partition(start,end);
			quickSort(start, pivot-1);
			quickSort(pivot+1, end);
			
			
		}
		
	}

	private int partition(int start, int end) {
		
		int pivot = arr.get(end);
		int i = start -1;
		for (int j = start ; j<= end -1;j++) {
			if(arr.get(j)<pivot) {
				i ++;
				swap(i,j);
			}
		}
		swap(i+1,end);
		return i+1;
	}

	private void swap(int i, int j) {
		int temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
		
		
	}
}
