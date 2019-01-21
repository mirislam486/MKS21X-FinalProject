import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.DataBufferByte;
import java.util.*;
import java.awt.Graphics2D;
public class ImageFilters{
  public static BufferedImage ogImage;
  public static Graphics2D newImage;
  public static String imgFile;
  public int height;
  public int width;


  public ImageFilters(String imgFile)throws IOException{
    File original = new File(imgFile);
    ogImage = ImageIO.read(original);
    //width = ogImage.getWidth();
    //height = ogImage.getHeight();
    //for(int x = 0; x < width; x++){
      //for(int y = 0; y < height; y++){
        // pixels.add(toString(ogImage.getRGB(x, y)));
       //}
     //}
  }


  public static void setStuff(){

  }

  public static String toString(int input){
    return input + "";
  }

  //public static void pixelArray(){
  //  ArrayList<String> pixels = new ArrayList<String>();
  //  width = ogImage.getWidth();
  //  height = ogImage.getHeight();
  //  for(int x = 0; x < width; x++){
  //    for(int y = 0; y < height; y++){
    //     pixels.add(toString(ogImage.getRGB(x, y)));
    //  }
    //}
  //}

  public boolean grayscale(){
    width = ogImage.getWidth();
    height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
        int oldRGB = ogImage.getRGB(x, y);
        int newRGB = oldRGB / 5;
        ogImage.setRGB(x, y, newRGB);
      }
    }
    return true;
  }

  public int clear(){
    int width = ogImage.getWidth();
    int height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
        ogImage.setRGB(x, y, 1);
      }
    }
    return 0;
    }

  public String info(){
    return ogImage.toString();
  }

public boolean transparency(double magnitude){
  //ogImage.setTransparency(magnitude);
  return false;
}

}
