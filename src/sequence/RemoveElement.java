package sequence;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int lst = A.length-1;
        while(lst >= 0 && A[lst] == elem){
            lst--;
        }
        int cur = 0;
        while(cur < lst){
            if (A[cur] != elem) {
                cur++;
                continue;
            }
            A[cur] = A[lst];
            A[lst] = elem;
            while(A[lst] == elem && lst >= 0){
                lst--;
            }
            cur++;
        }
        return lst;
    }

}
