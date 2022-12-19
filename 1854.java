class Solution {
    public int maximumPopulation(int[][] logs) {
             int[] popChange = new int[101];
        for (int[] log :logs) {
            popChange[log[0]-1950]++;
            popChange[log[1]-1950]--;
        }
        
        int maxPop = -1;
        int bestYear = -1;
        int lastYearPop = 0;
        for (int i = 0; i < popChange.length; i++) {
            int currentYearPop = lastYearPop + popChange[i];
            if (currentYearPop > maxPop) {
                maxPop = currentYearPop;
                bestYear = 1950 + i;
            }
            lastYearPop = currentYearPop;
        }
        return bestYear;
    }
}