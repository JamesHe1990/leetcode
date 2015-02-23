
public class SearchInRotatedArray {
	public int search(int[] A, int target) {
        int length = A.length;
        if (length == 0) return -1;
        return searchHelper(A, 0,length-1,target);
    }
    public int searchHelper(int A[], int start, int end, int target){
        if (start == end) return (A[start] == target) ? start: -1;
        int mid = start + (end-start)/2;
        if (A[mid] == target) return mid;
        if (A[mid] >= A[start]) {
            if (target >= A[start] && target < A[mid]){
                return searchHelper(A, start, mid-1, target);
            }else {
                return searchHelper(A, mid+1, end, target);
            } 
        }else {
            if (target > A[mid] && target <= A[end]){
                return searchHelper(A, mid+1, end, target);
            } else{
                 return searchHelper(A, start, mid-1, target);
            }
        }
    }
}
