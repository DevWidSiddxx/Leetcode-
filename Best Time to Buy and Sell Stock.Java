class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price:prices){
            minPrice=Math.min(minPrice,price);
            maxProfit=Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;}

        public static void main(String[] args){
            Solution sol = new Solution();
            System.out.println(sol.maxProfit(new int[]{7,5,3,2,1}));
            System.out.println(sol.maxProfit(new int[]{6,3,4,8,2}));
        }
        
    }
