class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res= new ArrayList<>();
        f(1,n,k, res, new ArrayList<>());
        return res;
    }
    public void f(int ind, int sum, int k, List<List<Integer>> res, List<Integer> list) {
        if(sum == 0) {
            if(list.size()==k) res.add(new ArrayList<>(list));
            return;
        }
        if(ind > sum || ind >9) return;
        list.add(ind);
        f(ind+1, sum-ind,k,res,list);
        list.remove(list.size()-1);
        f(ind+1, sum, k, res, list);
    }
}
