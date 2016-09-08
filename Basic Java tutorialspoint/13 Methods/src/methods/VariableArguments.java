
package methods;

public class VariableArguments {
    
    public void numbers(int... numbers) {
        for(int number: numbers) {
            System.out.println(number);
        }
    }
    
    public static void main(String[] args) {
        VariableArguments vd = new VariableArguments();
        vd.numbers(12, 15, 20, 80, 78);
        
        vd.numbers(new int[]{5, 8, 6, 78, 98});
    }
    
    
    public void finalize() {
        System.out.println("Class closed");
    }
}
