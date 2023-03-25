public class Static {
    int x;
    static int y;

    int sum(){
        return x + y;
    }
}

class Demo{
    public static void main(String[] args) {
        Static ob1 = new Static();
        Static ob2 = new Static();

        ob1.x = 10;
        ob2.x = 20;


        System.out.println("Of course, ob1.x and ob2.x " + "are independent.");
        System.out.println("ob1.x: " + ob1.x + " \nob2.x: " + ob2.x);
        System.out.println();

        System.out.println("the static variable y is shared.");
        Static.y = 19;
        System.out.println("Set Static.y to 19.");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        Static.y = 100;
        System.out.println("Change Static.y to 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
    }
}
