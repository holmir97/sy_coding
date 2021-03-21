public class MonotonicArr {

    // my solution(o(n)) two pass로 구하기
    public boolean isMonotonic(int[] A) {
        boolean flag = true;
        boolean direct = false;

        if (A[0] - A[A.length - 1] < 0)
            direct = true;

        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1)
                continue;

            if (direct) {
                if (A[i] > A[i + 1])
                    flag = false;
            } else {
                if (A[i] < A[i + 1])
                    flag = false;
            }

        }
        return flag;
    }
}

/* another solution(o(n)) one pass로 구하기
class Solution {
    public boolean isMonotonic(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            int c = Integer.compare(A[i], A[i+1]);
            if (c != 0) {
                if (c != store && store != 0)
                    return false;
                store = c;
            }
        }

        return true;
    }
}
 */
