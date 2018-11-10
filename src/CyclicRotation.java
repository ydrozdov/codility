public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int len = A.length;

        if (len < 2) {
            return A;
        }

        if (len < K) {
            K = K % len;
        }

        while (K > 0) {
            int last = A[len - 1];
            A[len - 1] = A[len - 2];
            for (int i = len - 2; i > 0; i--) {
                A[i] = A[i - 1];
            }

            A[0] = last;
            K--;
        }

        return A;
    }
}
