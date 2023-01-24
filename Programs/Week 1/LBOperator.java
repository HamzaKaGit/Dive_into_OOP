public class LBOperator {
    public static void main(String[] args) {
        int a = 10; // 00001010 = 10
        int b = 12; // 00001100 = 12
        int and, or, xor, na;
        and = a & b; // 00001000 = 8
        or = a | b; // 00001110 = 14
        xor = a ^ b; // 00000110 = 6
        na = ~a; // 11110101 = -11
        System.out.println("and " + and);
        System.out.println("or " + or);
        System.out.println("xor " + xor);
        System.out.println("na " + na);
    }
}
