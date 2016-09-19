package generics;

public class Main {

    public static void main(String[] args) {
	    GenericMethodTest gmt = new GenericMethodTest();
        gmt.display();

        System.out.println("Max is : " + gmt.maximum(5, 2, 15));
        System.out.println("Max is : " + gmt.maximum(5.3, 2.1, 1.5));


        System.out.println("\nGeneric Class");
        Box<Integer> intBox = new Box<Integer>();
        Box<String> strBox = new Box<String>();

        intBox.set(452);
        strBox.set("Mamun Sarkar");

        System.out.println("Integer : " + intBox.get());
        System.out.println("String : " + strBox.get());

    }

}
