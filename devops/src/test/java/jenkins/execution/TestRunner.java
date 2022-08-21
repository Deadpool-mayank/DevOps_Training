package jenkins.execution;

import java.io.File;
import java.io.IOException;

public class TestRunner {

    public static void main(String[] args) throws IOException {
        File file = new File("JavaFile.java");

        try {

            // create a new file with name specified
            // by the file object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("New Java File is created by Mayank.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }


    }

}
