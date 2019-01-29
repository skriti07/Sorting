import java.util.Arrays;

public class SortNew {

	public static void main(String[] args) {
		int arr1[]= {6,8,3,2,9,1};
		 int n = arr1.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr1[i]; 
	            int j = i-1; 
	        while (j>=0 && arr1[j] > key) 
	            { 
	                arr1[j+1] = arr1[j]; 
	                j = j-1; 
	            } 
	            arr1[j+1] = key; 
	        } 
	        System.out.println(Arrays.toString(arr1));
	}

}
