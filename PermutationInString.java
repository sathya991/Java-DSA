public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int[] freq = new int[26];
        int m = s2.length();
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] freq2 = new int[26];
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, freq2))
                return true;
        }
        return false;
    }
}
/*
 * The basic solution is to get all permutations and check each bucket of
 * characters with length same as s1 and if its exisiting in it or not
 * The best solution is to take two arrays one to keep track of s1 characters
 * and another to keep track of s2 characters
 * But the trick while checking second string is to do it as sliding window,
 * with each window being the size of first string
 * while looping through second string we remove the character which from the
 * start before the length of first string making sure we always have
 * only exactly characters of same size in each array and each time we check if
 * both are same arrays, we have a permutation.
 */