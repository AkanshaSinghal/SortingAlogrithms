package Sorting;


import java.util.ArrayList;

public class MergeSort {
	
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
     
     
     public void mergeSort(int x,int y){
    	 
         if(x == y){
             
             return;
             
         }
         else{
             int mid = (x+y)/2;
        	 mergeSort(x,mid);
        	 mergeSort(mid+1,y);
        	 mergeArray(x,mid,mid+1,y);
        	 return;
        	 
         }
     }


	private static void mergeArray(int x1,int x2,int y1, int y2) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		for(int i=x1;i<=x2;i++) {
			a1.add(arr.get(i));
		}
		for(int j=y1;j<=y2;j++) {
			a2.add(arr.get(j));
		}
		
		int t1=0;
		int t2=0;
		int k =x1;
			while (t1 < a1.size() && t2 < a2.size()) {
				if (a1.get(t1) > a2.get(t2)) {
					arr.set(k, a2.get(t2));
					t2++;
					k++;
				}
				else {
					arr.set(k, a1.get(t1));
					t1++;
					k++;
					
				}
				
			}
			while(t1<a1.size()) {
				arr.set(k, a1.get(t1));
				t1++;
				k++;
			}
			while(t2<a2.size()) {
				arr.set(k, a2.get(t2));
				t2++;
				k++;
			}
		}
	

}
