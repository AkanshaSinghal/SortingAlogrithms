package ArrayQuestions;

import java.util.ArrayList;

//Given an unsorted integer array, find the first missing positive integer.
//
//Example:
//
//Given [1,2,0] return 3,
//
//[3,4,-1,1] return 2,
//
//[-8, -7, -6] returns 1
//
//Your algorithm should run in O(n) time and use constant space.

public class FirstMissingElement {
	
    public int firstMissingPositive(ArrayList<Integer> A) {
        
        int n = A.size();
        int result=1;
        
        
        
        for(int i =0;i<n;i++){
        	while(A.get(i) != i+1 || A.get(i)!=null) {
        		int pos = A.get(i)-1;
                if(pos<= n-1 && pos>=0){
                    int temp = A.get(i);
    		        A.set(i, A.get(pos));
    		        A.set(pos, temp);
                }
                else {
                	A.set(i, null);
                }
        	}
             
        }
        for(int i =0;i<n;i++){
            if(A.get(i)!= i+1){
                result = i+1;
            }
             else
             result = n+1;
            
        }
        
        return result;

    }

}
