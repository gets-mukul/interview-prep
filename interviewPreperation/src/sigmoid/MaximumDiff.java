package sigmoid;
// https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
public class MaximumDiff {

	public static void main(String[] args) {
		int[] arr = {7, 9, 5, 6, 3, 2};
		
		int min  = Integer.MAX_VALUE;
		int max_diff = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] > min) {
				max_diff = Math.max(max_diff, arr[i] - min);
			}
			else {
				min = arr[i];
			}
		}
		System.out.println(max_diff);

	}

}
