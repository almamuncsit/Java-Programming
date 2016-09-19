package innerclass;

class Outer_Demo {

    int num;
    //inner class

    public class Inner_Demo {

        public void print() {
            System.out.println("This is an inner class");
        }
    }
    //Accessing he inner class from the method within

    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class InnerClass {

    public static void main(String[] args) {
        Outer_Demo outer = new Outer_Demo();
        outer.display_Inner();
        
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        inner.print();
        
    }

}
