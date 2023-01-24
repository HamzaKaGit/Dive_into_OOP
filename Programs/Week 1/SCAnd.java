public class SCAnd {
    public static void main(String[] args) {
        boolean b;
        int j, k;
        j = 0;
        k = 0;
        b = (j++ == k) && (j == ++k);
        System.out.println("b, j, k " + b + ", " + j + ", " + k);
        j = 0;
        k = 0;
        b = (j++ != k) && (j == ++k);
        System.out.println("b, j, k " + b + ", " + j + ", " + k);
    }
}
