package filesandio;

import java.io.*;

public class Directories {

    public static void main(String[] args) {
        File d = new File("folder");
        d.mkdir();

        File f = new File("folder/new/file");
        f.mkdirs();

        //Read directory
        File file = null;
        String[] paths;
        try {
            file = new File("folder");
            paths = file.list();
            
            for(String path: paths) {
                System.out.println(path);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
