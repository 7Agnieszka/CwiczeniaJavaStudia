package projekt;

public class Factorial {

    private int n;
    public Factorial(int n) {
        this.n = n;
    }
    public long countFactorial() {
        long result = 1;
        for (int i = 1; i <= n; ++i) {
            result = result * i;
        }
        return result;
    }


}
