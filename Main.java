import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception, AWTException {
        MyThread thread = new MyThread();
        thread.start();

//        String ACCESS_TOKEN = "UxKoErmVljAAAAAAAAAMfWn2MlsovB_E5T5zavLwnBeOq0boT-D6MdOUGaeL3hyq";
//        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
//        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        // Upload "test.txt" to Dropbox
//        try {
//            InputStream in = new FileInputStream("C:/Users/alex/Desktop/ex.txt");
//            FileMetadata metadata = client.files().uploadBuilder("/thisfilewillbecreated.txt").uploadAndFinish(in);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
