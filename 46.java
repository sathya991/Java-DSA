class Solution {
    public List<List<Integer>> permute(int[] nums) {
     List<Integer> array = Arrays.stream(nums).boxed().collect(Collectors.toList());
     List<List<Integer>> permList = new ArrayList<>();
       permHelper(array,new ArrayList<Integer>(),permList);
      return permList;
    }
    public  void permHelper(List<Integer> ar, List<Integer> curPerm, List<List<Integer>> permList){
      if(ar.size() == 0){
        permList.add(curPerm);
      }
     else{
       for(int i = 0;i < ar.size();i++){
        List<Integer> tempList = new ArrayList<>(ar);
        List<Integer> tempPerm = new ArrayList<>(curPerm);
        tempPerm.add(ar.get(i));
        tempList.remove(ar.get(i));
        permHelper(tempList,tempPerm,permList);
       }
     }

    }
}