/* 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
 */
package leetCode;

public class Problem0122 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
		
	}
	
    public static int maxProfit(int[] prices) {

    	int buy, sell, profit = 0, len = prices.length - 1;

    	for(int i = 0; i < len; i++) {
    		while(i < len && prices[i] >= prices[i + 1]) { 
    			i++; 
    		}
    		buy = prices[i];
    		while(i < len && prices[i] < prices[i + 1]) {
    			i++;
    		}
    		sell = prices[i];
    		profit += sell - buy;
    		
    	}
    	return profit;
    }
}
