package sequence;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
        int idx1 = m-1;
        int idx2 = n-1;
        while(idx1 >= 0 && idx2 >= 0){
            if(A[idx1] >= B[idx2]){
                A[idx1+idx2+1] = A[idx1];
                idx1--;
            } else {
                A[idx1+idx2+1] = B[idx2];
                idx2--;
            }
        }
        if (idx2 >=0){
            for(int i = 0; i < idx2; i++){
                A[i] = B[i];
            }
        }
    }
}
