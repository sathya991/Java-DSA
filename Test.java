import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        // double x = 2;
        // int n = 8;
        // List<Integer> ar = new ArrayList<>();
        // ar.add(1);
        // ar.add(2);
        // ar.add(3);
        String s = "1905";

        System.out.println(phoneNumberMnemonics(s));
       
    }
    public static ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
      // Write your code here.
      Map<Integer, List<Character>> map = new HashMap<>();
      map.put(0,Arrays.asList('0'));
      map.put(1,Arrays.asList('1'));
      map.put(2,Arrays.asList('a','b','c'));
      map.put(3,Arrays.asList('d','e','f'));
      map.put(4,Arrays.asList('g','h','i'));
      map.put(5,Arrays.asList('j','k','l'));
      map.put(6,Arrays.asList('m','n','o'));
      map.put(7,Arrays.asList('p','q','r','s'));
      map.put(8,Arrays.asList('t','u','v'));
      map.put(9,Arrays.asList('w','x','y','z'));
      ArrayList<String> result = new ArrayList<>();
      StringBuilder s = new StringBuilder("");
      for(int i = 0;i < phoneNumber.length();i++){
        List<Character> c = map.get(Character.getNumericValue(phoneNumber.charAt(i)));
        s.append(c.get(0));
      }
      result.add(s.toString());
      helper(phoneNumber,map,result,0,s.toString());
      return result;
    }
  
    public static void helper(String str, Map<Integer,List<Character>> map,List<String> result,int i,String s){
      StringBuilder curStr = new StringBuilder(s);
      if(i == str.length()){
        if(result.contains(curStr.toString())){
          return;
        }
        result.add(curStr.toString());
        return;
      }
      List<Character> chars = new ArrayList<>(map.get(Character.getNumericValue(str.charAt(i))));
      if(curStr.charAt(i) == '0' || curStr.charAt(i) == '1'){
        helper(str,map,result,i+1,s.toString());
    
      }
      for(int j = 0;j < chars.size();j++){
        curStr.setCharAt(i,chars.get(j));
        helper(str,map,result,i+1,curStr.toString());
      }
    }
    }
