import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.DataBufferByte;
import java.util.*;
public class ImageFilters{
  public static ArrayList<String> pixels;
  public static BufferedImage ogImage;
  public static String imgFile;
  public static int height;
  public static int width;

  public ImageFilters(String imgFile)throws IOException{
    File original = new File(imgFile);
    ogImage = ImageIO.read(original);
    ArrayList<String> pixels = new ArrayList<String>();
    width = ogImage.getWidth();
    height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
         pixels.add(toString(ogImage.getRGB(x, y)));
       }
     }
  }


  public static void setStuff(){
    width = ogImage.getWidth();
    height = ogImage.getHeight();
  }

  public static String toString(int input){
    return input + "";
  }

  public static void pixelArray(){
    ArrayList<String> pixels = new ArrayList<String>();
    width = ogImage.getWidth();
    height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
         pixels.add(toString(ogImage.getRGB(x, y)));
      }
    }
  }

  public static ArrayList<String> grayscale(){
    return pixels;
  }

  public int sharpen(int[] pixels){
    return 0;
  }

  public static void main(String[] args) throws IOException{
    ImageFilters newFile = new ImageFilters("cake.jpg");
    System.out.println(newFile.grayscale());

  }
}
