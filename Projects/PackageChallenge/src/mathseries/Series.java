package mathseries;

public class Series {
    public static int[] nSum(int n) {
        if (n == 0)
            return null;
        else {

            int[] arr = new int[n + 1];
            int sum = 0;

            for (int i = 0; i <= n; ++i) {
                sum += i;
                arr[i] = sum;
            }
            return arr;
        }
    }

    public static int[] factorial(int n) {
        if (n == 0)
            return null;
        else {
            int[] arr = new int[n];
            int factorial = 1;

            for (int i = 1; i <= n; ++i) {
                factorial *= i;
                arr[i - 1] = factorial;
            }
            return arr;
        }

    }

    public static int[] fibonacciSeries(int n) {
        if (n == 0)
            return null;
        else {
            int[] arr = new int[n];
            int v1 = 1;
            int v2 = 1;
            int sum;

            for (int i = 0; i < n; ++i) {
                if (i < 2)
                    arr[i] = v1;
                else {
                    sum = v1 + v2;
                    arr[i] = sum;
                    v1 = v2;
                    v2 = sum;
                }
            }
            return arr;
        }
    }
}
