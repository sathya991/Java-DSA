class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            count[t.charAt(j) - 'a']--;
        }
        for (int k : count) {
            if (k != 0)
                return false;
        }
        return true;
    }
}

/*
 * We can solve this using arraylist, hashmap and array
 * I took array here to have 26 character length
 * We loop through first string and increment all those character int values in
 * array by subtracting by 'a' making sure than value always lie between
 * 0 and 26
 * We loop through second string and decrement the characters in same array
 * then we loop through array to see if all values are zeroes if not its not an
 * anagram
 */