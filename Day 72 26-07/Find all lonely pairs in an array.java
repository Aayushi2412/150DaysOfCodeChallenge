class Solution {
    public List<Integer> findLonely(int[] nums) {
        //tc=O(n) and SC=O(n)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n, map.getOrDefault(n,0)+1);   //to count the frequency
        }
        List<Integer> ans=new ArrayList<>();
        for(int n:map.keySet())
        {
            if(map.get(n)==1 && !map.containsKey(n-1) && !map.containsKey(n+1))
            ans.add(n);
        }
        return ans;
    }
}
