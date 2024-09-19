package Arrays_DSA;

public class PascalTriangle {
    // public static long nCr(int n, int r) {
    //     long res = 1;

    //     // calculating nCr:
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }

    // public static int pascalTriangle(int r, int c) {
    //     int element = (int) nCr(r - 1, c - 1);
    //     return element;
    // }

    // public static void main(String[] args) {
    //     int r = 5; // row number
    //     int c = 3; // col number
    //     int element = pascalTriangle(r, c);
    //     System.out.println("The element at position (r,c) is: " + element);
    // }

    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
} 