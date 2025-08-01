// Last updated: 8/1/2025, 6:44:37 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        genpair(ls,nums,arr);
        return ls;
    }
    public static void genpair(List<List<Integer>> ls,int [] nums,List<Integer> arr){
        if (nums.length==0){
            ls.add(new ArrayList<>(arr));
            return;
        }
       
        for (int i=0;i<nums.length;i++){
            int num=nums[i];
            int [] arr1=new int[nums.length-1];
            int c=0;
            for (int number:nums){
                if (number!=num){
                    arr1[c]=number;
                    c++;
                }
            }
            arr.add(num);
            genpair(ls,arr1,arr);
            arr.remove(arr.size() - 1);
        }
    }
    
}