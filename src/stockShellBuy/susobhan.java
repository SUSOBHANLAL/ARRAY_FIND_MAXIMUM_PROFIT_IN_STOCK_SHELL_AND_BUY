package stockShellBuy;

public class susobhan {
	public static void main(String args[]) {
		int arr[] = {3,1,4,8,7,2,5};
		int n = arr.length;
		int maxsum=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i+1;j<n;j++) {
				sum= arr[j]-arr[i];
				
				
				if(maxsum<sum) {
					maxsum = sum;
				}
			}
		
		}
		System.out.print("the maxsum profit is   "+maxsum+" ");
	
}

}
