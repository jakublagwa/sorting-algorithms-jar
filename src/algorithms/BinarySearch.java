package algorithms;

public class BinarySearch {
	public static int
	binarySearch(int array[], int target) {
		int left=0;
		int right=array.length;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(array[mid]==target) {
				return mid;
			}else if(array[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return left;
	}
	
	
}
