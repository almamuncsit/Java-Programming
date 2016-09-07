
package pkg10.arrays;


public class Arrays {

    public static void main(String[] args) {
        int[] id = new int[5];
        id[0] = 500;
        System.out.println(id[0]);
        
        
        String[] names = {"Mamun", "Sarkar", "Khan"};
        System.out.println(names[0]);
        System.out.println(names.length);
        
        java.util.Arrays.sort(names);
        
        System.out.println(java.util.Arrays.binarySearch(names, "Mamun"));
        
        for(String name: names) {
            System.out.println(name);
        }
    }
    
}
