

public class Constant {
   // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";

   public static void main(String args[]){
      salary = 1000;
//      Constant.salary = 1000; // Or use Class name . variable name
      System.out.println(DEPARTMENT + "average salary:" + salary);
   }
}
