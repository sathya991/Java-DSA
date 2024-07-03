class Solution {

    public String encode(List<String> strs) {
        StringBuilder returnString = new StringBuilder();
        for (String str : strs) {
            returnString.append(str.length()).append('#').append(str);
        }
        return returnString.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> returnList = new ArrayList<>();
        int lenS = 0;
        for (int i = 0; i < str.length(); i++) {
            int lenE = lenS;
            while (str.charAt(lenE) != '#')
                lenE++;
            int length = Integer.valueOf(str.substring(lenS, lenE));
            lenS = lenE + 1 + length;
            i = lenS;
            returnList.add(str.substring(lenE + 1, lenS));
        }
        return returnList;
    }
}

/*
 * We convert the list of string to string like
 * keeping the length of string + a special character and the string
 * While converting string to list of string
 * we take the length and take substring of string with after special character
 * to length and add to list
 */
