package pkg07.number;

public class Trigonometry {

    public static void main(String[] args) {
        System.out.println("Sin 30 : " + Math.sin(45));
        System.out.println("Cos 30 : " + Math.cos(45));
        System.out.println("Tan 30 : " + Math.tan(45));

        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians), Math.toDegrees(Math.asin(Math.sin(radians))));
    }
}
