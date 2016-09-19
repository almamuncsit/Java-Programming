package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public void deSerialize() {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
            return;
        }

        System.out.println("Deserialize Data : ");
        System.out.println("Name : " + e.name);
        System.out.println("Address : " + e.address);
        System.out.println("SSN : " + e.SSN);
        System.out.println("Number : " + e.number);
    }
}
