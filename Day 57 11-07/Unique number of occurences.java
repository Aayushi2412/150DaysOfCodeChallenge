class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        //tc=O(n), sc=O(n)
        //HashMap to count and store the frequency of every element in the array arr
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        //HashSet to check unique frequencies existence
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(!set.contains(e.getValue())) set.add(e.getValue());
            else return false;
        }
        return true;
    }
}
