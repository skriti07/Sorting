
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {2,1,4,7,3,0};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
