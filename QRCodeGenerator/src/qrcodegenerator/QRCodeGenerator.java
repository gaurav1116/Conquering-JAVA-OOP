package qrcodegenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {

    public static void main(String[] args) throws Exception
    {
     String details = "Hey! Gaurav here. Have a nice day.";
    
     ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();   //Initially I tried for JPG format but it didnt worked, Ping me if there's any solution.
    
    File f = new File("/home/gaurav/qrcode.png");  //take care while giving file location
    FileOutputStream fos = new FileOutputStream(f);
    
    fos.write(out.toByteArray());
    fos.flush();
    }

}
