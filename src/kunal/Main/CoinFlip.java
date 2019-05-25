package kunal.Main;
public class CoinFlip {

    /**
     * The solution does at most three linear scans to determine which coin to flip. In the first
     * pass it looks for cases like 010 or 101 which would increase the adjacency by 2. In the
     * second pass it looks for cases like 100, 110, 011 or 001, where, by changing a single coin,
     * the adjacency may increase by 1 (only if the flipped element stands in first or last
     * position). If both of these passes don't find any suitable flip, then the array must be in an
     * already optimal configuration, so it flips the first element (it could be any element).
     * The third eventual pass consists of the computation of the adjacency for the array.
     * If n = len(coins):
     *      Time Complexity: O(n)
     *      Space Complexity: O(n)
     * 
     * @param coins The coin array
     * @return The maximum adjacency achievable for the array resulting from the required flip
     */
    public static int flipCoin(int[] coins) {
        if (coins.length == 0) {
            return 0;
        }
        
        for (int i = 1; i < coins.length - 1; i++) {
            if (coins[i - 1] != coins[i] && coins[i] != coins[i + 1]) { // 010 or 101
                coins[i] = coins[i] == 1 ? 0 : 1;
                return adjacency(coins);
            }
        }
        
        for (int i = 1; i < coins.length - 1; i++) {
            if (coins[i - 1] == coins[i] && coins[i] != coins[i + 1]) {
                coins[i + 1] = coins[i + 1] == 1 ? 0 : 1;
                return adjacency(coins);
            } else if (coins[i - 1] != coins[i] && coins[i] == coins[i + 1]) {
                coins[i - 1] = coins[i - 1] == 1 ? 0 : 1;
                return adjacency(coins);
            }
        }
        
        coins[0] = coins[0] == 1 ? 0 : 1;
        return adjacency(coins);
    }
    
    private static int adjacency(int[] A) {
        int adj = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] == A[i]) {
                adj++;
            }
        }
        return adj;
    }
    
    public static void main(String[] args) {
		int [] a =  {1,0,1,1,0,0,1,0,1,1};
		System.out.println(flipCoin(a));
		
	} 
}