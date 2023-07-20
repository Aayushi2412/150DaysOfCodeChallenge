//Java equivalent of above code
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
public static int minRemovals(List<int[]> ranges) {
	int size = ranges.size(), rem = 0;

	if (size <= 1)
	return 0;

	// Sort by minimum starting point
	Collections.sort(ranges, new Comparator<int[]>() {
	@Override
	public int compare(int[] o1, int[] o2) {
		return o1[0] - o2[0];
	}
	});

	int end = ranges.get(0)[1];
	for (int i = 1; i < ranges.size(); i++) {
	// If the current starting point is less than
	// the previous interval's ending point
	// (ie. there is an overlap)
	if (ranges.get(i)[0] < end) {
		// increase rem
		rem++;
		// Remove the interval
		// with the higher ending point
		end = Math.min(ranges.get(i)[1], end);
	} else
		end = ranges.get(i)[1];
	}

	return rem;
}

// Driver code
public static void main(String[] args) {
	List<int[]> input = new ArrayList<int[]>();
	input.add(new int[] { 19, 25 });
	input.add(new int[] { 10, 20 });
	input.add(new int[] { 16, 20 });
	System.out.println(minRemovals(input));
}
}
