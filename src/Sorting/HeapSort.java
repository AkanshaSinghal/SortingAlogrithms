package Sorting;

import java.util.ArrayList;

public class HeapSort {
	
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public void callHeapify(int size) {
		int limiter = arr.size()/2;
		for (int i =limiter-1;i>=0;i--) {
			
			minheapify(i,size);
			
			
		}
	}
	//creates min heap
	private void minheapify(int i,int size) {
		int left = 2*i +1;
		int right = 2*i+2;
		int minVal;
		if(left < size && arr.get(i)>arr.get(left)) {
			minVal = left;
			}
		else {
			minVal = i;
		}
		if(right < size && arr.get(minVal)>arr.get(right)) {
			minVal = right;
			}
		if(minVal != i) {
			int temp = arr.get(i);
			arr.set(i, arr.get(minVal));
			arr.set(minVal, temp);
			minheapify(minVal,size);
		}
		
	}
	//creates max heap
	private void maxheapify(int i, int size) {
		int left = 2*i +1;
		int right = 2*i+2;
		int maxVal;
		if(left < size && arr.get(i)<arr.get(left)) {
			maxVal = left;
			}
		else {
			maxVal = i;
		}
		if(right < size && arr.get(maxVal)<arr.get(right)) {
			maxVal = right;
			}
		if(maxVal != i) {
			int temp = arr.get(i);
			arr.set(i, arr.get(maxVal));
			arr.set(maxVal, temp);
			maxheapify(maxVal,size);
		}
		
		
	}
	
	
	public void heapSort() {
		System.out.println(arr);
		int size = arr.size();
		int newSize = 0;
		callHeapify(size);
		for (int i =size-1;i>=0;i--) {
			int temp = arr.get(0);
			arr.set(0, arr.get(i));
			arr.set(i, temp);
			newSize = i;
			callHeapify(newSize);
			
		}
		System.out.println(arr);
		
	}

}
