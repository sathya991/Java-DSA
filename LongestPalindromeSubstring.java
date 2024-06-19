class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int resultLength = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check odd
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (resultLength < right - left + 1) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left--;
                right++;
            }
            // Check Even
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (resultLength < right - left + 1) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return result;
    }
}

/*
 * The logic behind this is to loop the original string and
 * for each character check if its palindrome by going both sides and if its
 * palindrome also check if the length of current palindrome is
 * bigger than existing longest length. If so make that as the return result
 * We check second time incase its an even length and we dont have extra letter
 * in between.
 */