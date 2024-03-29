package Task1;

public class Task1Arcsin {
    public static double arcsin(double x, int n) {
        if (Math.abs(x) <= 1) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (factorial(2 * i) / (Math.pow(4, i) * Math.pow(factorial(i), 2) * (2 * i + 1))) * Math.pow(x, 2 * i + 1);
            }
            return sum;
        }else{
            return Double.NaN;
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
