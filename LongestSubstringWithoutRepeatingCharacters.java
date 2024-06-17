class Solution {
    public int lengthOfLongestSubstring(String s) {
        int first = 0;
        int last = 0;
        int max = 0;
        HashMap<Character, Integer> checkMap = new HashMap<>();
        while (last != s.length()) {
            if (!checkMap.containsKey(s.charAt(last)) || checkMap.get(s.charAt(last)) < first) {
                checkMap.put(s.charAt(last), last);
                max = Math.max(max, last - first + 1);
            } else {
                first = checkMap.get(s.charAt(last)) + 1;
                checkMap.put(s.charAt(last), last);
            }
            last++;
        }
        return max;
    }
}
/*
 * In this the optimal solution is to loop through the string and maintain a
 * hashmap with character and index of where its present and two variables
 * 
 * Once started looping, if the character is present in the map then move the
 * first variable to where the repeating character
 * is present + 1 and change the index of character in map to latest.
 * 
 * If not present then take the max length as last - first +1.
 * 
 * extra case is to check if the repeating character is less than first, in that
 * case just add to max and not move the first.
 */