package qrcodegenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
     String details = "Hey! Gaurav here. Have a nice day.";
    
     ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
    
    File f = new File("/home/gaurav/qrcode.jpg");
    FileOutputStream fos = new FileOutputStream(f);
    
    fos.write(out.toByteArray());
    fos.flush();
    }

}
