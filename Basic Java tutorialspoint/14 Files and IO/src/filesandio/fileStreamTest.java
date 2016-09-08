package filesandio;

import java.io.*;

public class fileStreamTest {

    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5, 78, 45, 21};
                OutputStream os = new FileOutputStream("test.txt");
            
            for(int i=0; i<bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();
            
            InputStream in = new FileInputStream("test.txt");
            int size = in.available();
            
            for(int i =0; i<size; i++) {
                System.out.println(in.read());
            }
            in.close();
        } catch (IOException e) {
        }
    }
}
