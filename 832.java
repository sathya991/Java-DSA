class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i< image.length;i++){
             reverse(image[i]);
             inverse(image[i]);
        }
        return image;
    }
    void reverse(int[] ar){
        int j =0;
        for(int i = ar.length-1;i>=ar.length/2;i--){
            int temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;
            j++;
        }
    }
    
    void inverse(int[] ar){
        for(int i = 0;i < ar.length;i++){
            if(ar[i] == 0){
                ar[i] = 1;
            }
            else{
                ar[i] = 0;
            }
        } 
    }
}