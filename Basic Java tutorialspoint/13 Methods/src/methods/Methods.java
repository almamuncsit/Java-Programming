
package methods;


public class Methods {
    
    public Methods() {
        System.out.println("This is constructor");
    }
    
    static int sum(int a, int b) {
        return (a+b);
    }
    
    public void display() {
        System.out.println("Welcome to bangladesh");
    }

    public int display(int p) {
        System.out.println("Ans is : " + this.sum(12, 12));
        System.out.println("This is another Method: " + p);
        return 0;
    }
    
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.display();
        methods.display(55);
        
        System.out.println("Sum is : " + sum(5, 45));
        System.out.println("Sum is : " + sum(50, 45));
    }
    
}
