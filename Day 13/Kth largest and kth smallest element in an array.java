import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		Collections.sort(arr);
		ArrayList<Integer> ans=new ArrayList<>(2);
		ans.add(arr.get(k-1));  //kth smallest element
		ans.add(arr.get(n-k)); //kth largest element
		return ans;

	}
}
