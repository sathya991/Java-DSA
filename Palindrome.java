class Solution {
    public boolean isPalindrome(int x) {
        String val = String.valueOf(x);
        int i = 0;
        int j = val.length() - 1;
        while (i < j) {
            if (val.charAt(i) == val.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }
}
/*
 * Basic - Convert to string and loop from start and end to check if both are
 * same if not false
 * 
 * Better - Reverse the number and compare with original, if both same true else
 * false
 * 
 * Optimal -
 */