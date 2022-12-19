class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String,List<String>> itemsMap = new HashMap<>();
        int count = 0;
        for(List i: items){
            List<String> colors = itemsMap.get("color") == null ? new ArrayList<>():itemsMap.get("color");
            List<String> types = itemsMap.get("type") == null ? new ArrayList<>():itemsMap.get("type");
            List<String> names = itemsMap.get("name") == null? new ArrayList<>():itemsMap.get("name");

             colors.add(i.get(1).toString());
                itemsMap.put("color",colors);

             types.add(i.get(0).toString());
                itemsMap.put("type",types);

              names.add(i.get(2).toString());
                itemsMap.put("name",names);
        }
        List<String> requiredList= itemsMap.get(ruleKey);
        for(String s: requiredList){
            if(s.equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}