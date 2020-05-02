package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;


//Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//Example:
//
//Given the following matrix:
//
//[
//    [ 1, 2, 3 ],
//    [ 4, 5, 6 ],
//    [ 7, 8, 9 ]
//]
//You should return
//
//[1, 2, 3, 6, 9, 8, 7, 4, 5]

public class SpiralOrder {
	
	public  static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int col = A.get(0).size();
		int row = A.size();
		int imin =  0 , imax = row-1, jmin = 0, jmax = col-1;
		
		while(imin<=imax && jmin<=jmax) {
				for (int x = jmin ; x<=jmax;x++) {
//					System.out.println("(" + imin + "," + x + ")");
					System.out.println(A.get(imin).get(x));
					output.add( A.get(imin).get(x));
					
				}
				
			for(int y = imin+1;y<=imax;y++) {
//				System.out.println("(" + y + "," + jmax + ")");
				System.out.println(A.get(y).get(jmax));
				output.add( A.get(y).get(jmax));
			}
			if (imin != imax) {
				for (int x = jmax-1; x >= jmin; x--) {
//				System.out.println("(" + imax + "," + x + ")");
					System.out.println(A.get(imax).get(x));
					output.add(A.get(imax).get(x));
				}
			}
			
			if (jmin != jmax) {
				for (int y = imax-1; y > imin; y--) {
//				System.out.println("(" + y + "," + jmin + ")");
					System.out.println(A.get(y).get(jmin));
					output.add(A.get(y).get(jmin));
				}
			}
			imin++;
			jmin++;
			imax--;
			jmax--;
			
		}
		return output;

	}

}
