class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        int minRow = 0;
        int minCol = 0;
        List<Integer> finalAr = new ArrayList<>();
         while((minRow < maxRow-1) && (minCol < maxCol-1)){
           minCol = countRight(minRow,minCol,maxCol,finalAr,matrix);
            minRow = countDown(minRow,maxRow,maxCol,finalAr,matrix);
            maxCol = countLeft(minCol,maxCol,maxRow,finalAr,matrix);
            maxRow = countUp(minRow,maxRow,minCol,finalAr,matrix);
         }
          if(matrix[0].length == matrix.length){

         }else{
            if(matrix[0].length == 2){
                maxRow = minRow +1;
             } else if(matrix.length == 2){
                maxCol = minCol+1;
             }
         }

         if(minRow == maxRow-1){
            while(minCol < maxCol){
                finalAr.add(matrix[minRow][minCol]);
                minCol++;
            }
         }
         else if(minCol == maxCol-1){
            while(minRow < maxRow){
                finalAr.add(matrix[minRow][minCol]);
                minRow++;
            }
         }
        return finalAr;
    }

    public int countRight(int minRow,int minCol,int maxCol,List<Integer> ar,int[][] matrix){
        //Except 1st time rest all times increase minCol by 1
        int i = minCol;
        if(ar.size() != 0){
            minCol++;
        }
        while(i < maxCol){
            ar.add(matrix[minRow][i]);
            i++;
        }
        return minCol;
    }
    public int countDown(int minRow,int maxRow,int maxCol, List<Integer> ar,int[][] matrix){
        //Increase minRow by 1 in 1st loop
        int i = minRow+1;
       minRow = minRow+1;
        while(i < maxRow){
            ar.add(matrix[i][maxCol-1]);
            i++;
        }
        return minRow;
    }
    public int countLeft(int minCol,int maxCol,int maxRow,List<Integer> ar,int[][] matrix){
        //decrease maxCol by 1
        int i = maxCol-2;
        
         maxCol--;
         while(i >= minCol){
             ar.add(matrix[maxRow-1][i]);
             i--;
         }
         return maxCol;
       
    }
    public int countUp(int minRow,int maxRow,int minCol,List<Integer> ar,int[][] matrix){
        //Decrease maxRow by 1 in 1st loop
        int i = maxRow-2;
        maxRow--;
        while(i >= minRow+1){
          ar.add(matrix[i][minCol]);
          i--;
        }  
        return maxRow;      
    }
}