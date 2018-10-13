import java.io.*;
import java.util.*;

public class ElementFinder {
	int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7 },
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
	};
	public int[] nearby(int x, int y, int range){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int NearbyCounter = -(range);
		for(int i = 0; i < range * 2;i++){
			if (NearbyCounter == 0){
				NearbyCounter += 1;
			}
			try{
					result.add(multi[x][y + NearbyCounter]);
			}  catch (IndexOutOfBoundsException e) {
				
			}
			NearbyCounter += 1;
		}
		System.out.println(result);
		int [] arrayResult = new int[result.size()]; 
		for(int i = 0; i < result.size();i++){
			arrayResult[i] = result.get(i);
		}
		return arrayResult;
	}
}