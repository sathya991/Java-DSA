class Solution {
    public String restoreString(String s, int[] indices) {
        char[] returnChar = new char[s.length()];
        for(int i=0;i < indices.length;i++){
            returnChar[indices[i]] = s.charAt(i);
        }
        return new String(returnChar);
    }
}