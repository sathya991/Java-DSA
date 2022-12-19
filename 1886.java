class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] newAr = new int[n][n];
        boolean val = true; 
        int y = 0;
        int[][] temp = mat;
        while(y <= 3){
            val = true;
         int k = 0;
        int p = 0;
       for(int i = 0; i < n;i++){
            p = 0;
            for(int j = n-1;j >= 0;j--){
                newAr[k][p] = temp[j][i];
                p++;
            }
            k++;
        }
        
        boolean[] vals = new boolean[n];
        for(int o = 0;o < n;o++){
            vals[o] = Arrays.equals(newAr[o],target[o]);
        }
        for(boolean s: vals){
            if(!s){
                temp = new int[n][n];
                temp = newAr;
                newAr = new int[n][n];
                val = false;
                break;
            }
        }
        if(val){
            break;
        }
        y++;
        }
        return val;
    }
}