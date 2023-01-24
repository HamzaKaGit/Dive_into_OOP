public class LO {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        System.out.println("f && f " + (f && f));
        System.out.println("f && t " + (f && t));
        System.out.println("t && f " + (t && f));
        System.out.println("t && t " + (t && t));
        System.out.println("f || f " + (f || f));
        System.out.println("f || t " + (f || t));
        System.out.println("t || f " + (t || f));
        System.out.println("t || t " + (t || t));
        System.out.println("!f " + !f);
        System.out.println("!t " + !t);

    }

}
