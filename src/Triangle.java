import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);

        int len = A.length;
        for (int i = 0; i < len - 2; i++) {
            if (A[i + 1] + A[i] > A[i + 2]) {
                return 1;
            }
        }

        return 0;
    }

}
