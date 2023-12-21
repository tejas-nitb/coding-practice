public static int maximumProfit(ArrayList<Integer> prices){
        int answer = 0;
        int n = prices.size();
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<n ; i++) {
            answer = Math.max(answer, prices.get(i)-minimum);
            minimum = Math.min(minimum, prices.get(i));
        }
        return answer;
    }
