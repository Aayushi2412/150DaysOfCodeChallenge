//replace all the elements of an array arr by the rank of the elements present in that array in the same order.
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=arr.clone();      //to create a new array of arr in sorted form
        Arrays.sort(ans);
        int k=1;
        for(int i=0;i<ans.length;i++)
        {
            map.putIfAbsent(ans[i],map.size()+1);
        }
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}
