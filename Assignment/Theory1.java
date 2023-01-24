
class one extends two {
    static {
        System.out.println("inside static block");
    }

    one() {
        System.out.println("inside constructor of child");
    }

    {
        System.out.println("inside initialization block");
    }}

    public class Theory1 {
        public static void main(String[] args) {
            new one();
            new one();
            System.out.println("inside main");
        }
    }

    class two {
        static {
            System.out.println("inside parent Static block");
        }
        {
            System.out.println("inside parent initialization block");
        }

        two() {
            System.out.println("inside parent constructor");
        }
    }

