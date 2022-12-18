public class Main{
    public static void main(String args[]){
        int[] nums = {21,24,123,512,112,25,67,1};
        int target = 25;
        String str = "Sathya";
        char target2 = 'y';
        System.out.println(linearSearch(nums, target));
        System.out.println(stringSearch(str, target2));
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        
        }
        return -1;
    }


    static char stringSearch(String str,char target){
        if(str.length() == 0){
            return 'z';
        }
        for(char i:str.toCharArray()){
            if(i == target){
                return i;
            }
        }
        return 'z';
    }
}