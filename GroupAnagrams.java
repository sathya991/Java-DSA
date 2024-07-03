class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sortedTrackMap = new HashMap<>();
        List<List<String>> resultList = new ArrayList<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sortedString = new String(temp);
            List<String> tempList = sortedTrackMap.getOrDefault(sortedString, new ArrayList<String>());
            tempList.add(s);
            sortedTrackMap.put(sortedString, tempList);
        }
        return new ArrayList<>(sortedTrackMap.values());
    }
}

/*
 * Brute force can be to loop twice and compare two strings for anagrams if its
 * anagram then add to list
 * Also check if it already exists in result list before checking for anagram so
 * that we dont repeat
 * 
 * Optimal -
 * Take a map with key as string and value as list of strings
 * Loop through the array and sort the string if that sorted string exists as
 * key in map then add that strin to the list for that key
 * if not create a new key pair with that sorted string as key and original
 * string as first element of list as value.
 * Continue till last.
 * In the end we have bucketed all the anagrams by using sort and map
 * Get the list of bucketed anagrams and add to array list and return it.
 * TC: O(n * k * log(k)) where n is size of array and k is longest string length
 */