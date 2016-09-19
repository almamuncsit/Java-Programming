package generics;


public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(x) > 0)
            max = y;

        if (z.compareTo(y) > 0)
            max = z;

        return  max;
    }


    public void display() {
        Integer[] intArray = {2, 45, 45, 84};
        Double[] doubleArray = {12.45, 45.12, 45.25, 45.12, 85.3};
        Character[] charArray = {'a', 'e', 'R', 'u'};

        this.printArray(intArray);
        this.printArray(doubleArray);
        this.printArray(charArray);
    }

}
