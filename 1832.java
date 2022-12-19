class Solution {
    public boolean checkIfPangram(String sentence) {
        char c = 'a';
        char[] alphs = new char[26];
        int i = 0;
        boolean returnVal = true;
        while(c <= 'z'){
            alphs[i] = c;
            i++;
            c++;
        }
        for(char ch: alphs){
            if(sentence.indexOf(ch) < 0){
                returnVal = false;
            }
        }
        return returnVal;
    }
}