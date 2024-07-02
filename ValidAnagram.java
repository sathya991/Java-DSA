class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] checkArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            checkArray[s.charAt(i) - 'a']++;
            checkArray[t.charAt(i) - 'a']--;
        }
        for (int check : checkArray)
            if (check != 0)
                return false;
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