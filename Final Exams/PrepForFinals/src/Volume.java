class shape{

double w,l,h;

void setvol(double a,double b,double c){

    w=a;
    l=b;
    h=c;
}
double getvol(){

return w*h*l;

}


}



public class Volume {
    public static void main(String[] args) {
        shape a=new shape();
        shape aaa=new shape();
        a.setvol(40, 21, 4);
        aaa.setvol(40, 25, 49);
       double u= a.getvol();
       double uu= aaa.getvol();
       System.out.println("Volume is" +u+"\n"+"second volume is "+uu);

    }
}
