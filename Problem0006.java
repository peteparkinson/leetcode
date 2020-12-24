/* 6. ZigZag Conversion
 * https://leetcode.com/problems/zigzag-conversion/
 */
package leetCode;

public class Problem0006 {
	public static void main(String[] args) {

		System.out.println(convert("PAYPALISHIRING", 3));
		//System.out.println(convert("PAYPALISHIRING", 4));
		
	}

    public static String convert(String s, int numRows) {
    	if(numRows == 1){return s;}
    	
    	StringBuilder[] arr = new StringBuilder[numRows + 1];
    	for(int i = 0; i < arr.length; i++) { arr[i] = new StringBuilder();}
    	
    	int i = 0;
    	int osc = 0;
		for(int j = 0; j < s.length(); j++) {
			arr[i].append(s.charAt(j));
    		i = osc == 0 ? i + 1: i - 1;
    		osc = i % (numRows-1) == 0 ? osc^-1: osc;
		}
    	for(int k = 0; k < numRows; k++) {
    		arr[numRows].append(arr[k]);
    	}
    	return String.valueOf(arr[numRows]);
    }
}
	
