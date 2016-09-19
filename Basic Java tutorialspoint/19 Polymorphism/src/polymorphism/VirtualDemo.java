package polymorphism;

public class VirtualDemo {

    public static void main(String[] args) {
        Salary s = new Salary("Khan", "Mirpur", 5, 50000.00);
        Employee e = new Salary("Kumar", "Mohammadpur", 6, 60000.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
