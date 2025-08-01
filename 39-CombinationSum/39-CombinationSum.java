// Last updated: 8/1/2025, 6:44:39 AM

class Solution {
    static List<List<Integer>> ls=new ArrayList<>() ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ls.clear();
        combination(candidates,target,new ArrayList<>(),0);
        return ls;
    }
    public static void combination(int [] candi,int target,List<Integer> ans,int idx){
        if (target==0){
            ls.add(new ArrayList<>(ans));
            return;
        }
        for (int i=idx;i<candi.length;i++){
            if (target>=candi[i]){
                ans.add(candi[i]);
                combination(candi,target-candi[i],ans,i);
                ans.remove(Integer.valueOf(candi[i]));
            }
        }
    }
}