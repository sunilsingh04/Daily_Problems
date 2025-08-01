// Last updated: 8/1/2025, 6:44:27 AM
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for (int i=0 ; i<wordDict.size() ; i++){
            set.add(wordDict.get(i));
        }
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return isItpossible(n,s,set,0,dp);
    }
    public static boolean isItpossible(int n, String s, HashSet<String> set, int i , int[] dp ){
        if (i==n){
            return true;
        }
        if (dp[i]!=-1){
            return dp[i]==1;
        }
        StringBuilder sb = new StringBuilder();
        for (int ind=i ; ind<n ; ind++){
            sb.append(s.charAt(ind));
            if (set.contains(sb.toString())){
                boolean res = isItpossible(n,s,set,ind+1,dp);
                if (res){
                    dp[i] = 1;
                    return true;
                }
            }
        }
        dp[i] = 0;
        return false;
    }
    
}