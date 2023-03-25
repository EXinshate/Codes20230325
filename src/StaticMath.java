public class StaticMath {
    static int val = 1024;
    static int valDiv2(){
        return val/2;
    }
}

class SDemo2{
    public static void main(String[] args) {
        System.out.println("val is " + StaticMath.val);
        System.out.println("StaticMath.valDiv2():" + StaticMath.valDiv2());

        StaticMath.val = 4;
        System.out.println("val is " + StaticMath.val);
        System.out.println("StaticMath.valDiv2():" + StaticMath.valDiv2());
    }
}
