package execution;

import java.io.File;
import java.io.IOException;

public class executionMainClass {

    public static void main(String[] args) throws IOException {
        File theDir = new File(System.getProperty("user.dir")+"/Results");
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }
}
