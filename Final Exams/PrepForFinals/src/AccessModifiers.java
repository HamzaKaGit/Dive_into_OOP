class a {

    public int a, b;
    private int c;

    void set_c(int i) {
        c = i;

    }

    int get_c() {

        return c;

    }

}
 class Aa {

public int i,j;


}
 class Bb extends Aa{
    
    int k;
  public void show (){
   System.out.println("I= "+ i +"j= " + j + "k= " + k );}

    void  sum(){
          System.out.println("Sum is"+(i+j+k));


        }
    }



public class AccessModifiers {
    public static void main(String[] args) {
        // a bb = new a();
        // bb.a = 67;
        // bb.b = 65;
        // bb.set_c(7);
        // bb.get_c();
        // System.out.println("Value of a=" + bb.a + "b=" + bb.b + "c=" + bb.get_c());



        Bb bb=new Bb();
       bb.i=17;
       bb.j=14;
        bb.k=15;
     bb.show();
     bb.sum();
     
    }
}
