class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int s = 0;
    int e = letters.length-1;
    if(target < letters[0] || target > letters[e]){
        return letters[0];
    }
    while(s <= e){
        int mid = s+(e-s)/2;
        if(letters[mid] > target ){
            e = mid -1;
        }
        else if(letters[mid] <= target){
            s = mid+1;
        }
    }
    return letters[s%letters.length];
    }
}