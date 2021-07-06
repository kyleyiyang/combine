class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lst =new ArrayList<List<Integer>>();
        backtrack(n,k,lst,new ArrayList<Integer>(),1);
        return lst;
    }
    public void backtrack(int n, int k,List<List<Integer>> lst,ArrayList<Integer> arr, int start) {
        if (arr.size()==k) {
            lst.add(new ArrayList<Integer>(arr));
            return;
        }
        for (int i=start;i<=n;i++) {
            arr.add(i);
            backtrack(n,k,lst,arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
}
