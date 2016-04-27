import java.util.Arrays;
public class Sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
    int arr[]={23,56,23,9,2,53,76};
    System.out.println("unsorted array");
    for(i=0;i<arr.length;i++){
    	System.out.println(arr[i]);
    }
    System.out.println("sorted array");
    Arrays.sort(arr);
    for(int j=0;j<arr.length;j++){
    	System.out.println(arr[j]);
    	}	
    }
	}


