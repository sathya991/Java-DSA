class Solution {
    public String defangIPaddr(String address) {
        String returnString = "";
        returnString = address.replace(".","[.]");
        return returnString;
    }
}