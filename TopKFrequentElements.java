class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> trackMap = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];
        for (int i : nums) {
            int val = trackMap.getOrDefault(i, 0);
            trackMap.put(i, ++val);
        }
        for (int key : trackMap.keySet()) {
            int bucketLevel = trackMap.get(key);
            if (bucket[bucketLevel] == null)
                bucket[bucketLevel] = new ArrayList<>();
            bucket[bucketLevel].add(key);
        }
        int l = 0;
        for (int m = nums.length; m >= 0; m--) {
            if (bucket[m] != null) {
                for (int value : bucket[m]) {
                    result[l++] = value;
                    if (l == k)
                        return result;
                }
            }
        }
        return result;
    }
}

/*
 * 
 * Here we can do this using hashmap and counting repetitions and then sorting
 * the map and getting the values
 * That is basic
 * O(NLogN)
 * To do in o(N)
 * we can use a bucket based system.
 * As usual we keep track of number of times each number is repeating in hashmap
 * Then we create a bucket ie. an array of arraylist with max of num size
 * We add to that array in places based on number of reps
 * ie. if a number repeats 3 times then we add that number to ar[3]
 * but as a number can repeat multiple times we take each bucket place as an
 * arraylist and add numbers to that lists
 * once done we loop from back to get max number of reps numbers. We add the
 * numbers till k array is full and return it.
 */