public class IAd {
    public static void main(String[] args) {
        int j, p, q, r, s;
        j = 5;
        p = ++j; // j = j + 1; p = j;
        System.out.println("p = " + p);
        q = j++; // q = j; j = j + 1;
        System.out.println("q = " + q);
        System.out.println("j = " + j);
        r = --j; // j = j -1; r = j;
        System.out.println("r = " + r);
        s = j--; // s = j; j = j - 1;
        System.out.println("s = " + s);  
    }

}
