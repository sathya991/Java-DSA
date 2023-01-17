class Solution {
    public boolean isValid(String str) {
         Stack<Character> trackStack = new Stack<>();
    for(int i = 0;i < str.length();i++){
      if(str.charAt(i) == '['){
        trackStack.push(']');
      }else if(str.charAt(i) == '{'){
        trackStack.push('}');
    }else if(str.charAt(i) == '('){
        trackStack.push(')');
  }
      else{
        if(str.charAt(i) != ']' && str.charAt(i) != '}' && str.charAt(i) != ')') continue;
        if(trackStack.isEmpty()) return false;
        if(str.charAt(i) != trackStack.pop()){
          return false;
        }
      }
}
    return trackStack.isEmpty();
    }
}