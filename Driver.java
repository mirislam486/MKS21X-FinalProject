import java.io.*;
import java.util.*;
public class Driver{
  public static void main(String[] args) throws IOException{
    ImageFilters newFile = new ImageFilters("cake.jpg");
    System.out.println(newFile.info());
    //try{
     //f = new File("C:\\Users\\Mir Sadia\\Desktop\\APCS\\MKS21X-FinalProject\\cake.jpg");
     //ogImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
     //ogImage = ImageIO.read(f);
   //}catch(IOException e){
     //System.out.println("Error: "+e);
   //}
   //try{
    //    f = new File("D:\\Image\\Output.jpg");
      //  ImageIO.write(image, "jpg", f);
        //System.out.println("Writing complete.");
    //  }catch(IOException e){
      //  System.out.println("Error: "+e);
      //}
  // System.out.prinln(grayscale());
    }
}
