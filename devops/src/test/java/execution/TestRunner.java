package execution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestRunner {

    public static void main(String[] args) throws IOException {
        File theDir = new File(System.getProperty("user.dir")+"/Results");
        if (!theDir.exists()){
            theDir.mkdirs();
        }
new TestRunner().Hi();
    }

    public void Hi() {System.out.println("Hello");}
}
