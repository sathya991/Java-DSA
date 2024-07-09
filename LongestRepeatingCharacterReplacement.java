class Solution {
    public int characterReplacement(String s, int k) {
        int[] trackAr = new int[26];
        int l = 0;
        int res = 0;
        int mfValue = 0;
        for (int i = 0; i < s.length(); i++) {
            trackAr[s.charAt(i) - 'A']++;
            mfValue = Math.max(mfValue, trackAr[s.charAt(i) - 'A']);
            if (i - l + 1 - mfValue > k) {
                trackAr[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}

/*
 * This is method is based on sliding window
 * Here, the logic is if the a particular sub string without its most frequent
 * character has length less than k ie, the elements can be replaced to make
 * all characters same Then that is a good string and if that has the longest
 * length till now. That will be the result.
 * Here, we start looping and keep track of the max value through character
 * array as well as a variable
 * For each character we check if the sub string length - maxfrequency is less
 * than k then we can make all characters same.
 * If not we move the first index ahead and check next substring.
 * We keep track of maximum possible array in every loop.
 */