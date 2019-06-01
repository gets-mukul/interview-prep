package sigmoid;

public class TogglingKthBit {

	public static void main(String[] args) {
		int x = 75;
		int k = 4;
		int ans =  x ^  (1 << (k-1));
		System.out.println(ans);

	}

}
