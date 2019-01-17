import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.DataBufferByte;
import java.util.*;
public class ImageFilters{
  public static int[][] colorArray;
  public static BufferedImage ogImage;
  public static String imgFile;
  public static int height;
  public static int width;

  public ImageFilters(String imgFile)throws IOException{

    //File original = new File("cake.jpg");
    //ogImage = ImageIO.read(original);

    //for (int ycor = 0; ycor < height; ycor++){
      // for (int xcor = 0; xcor < width; xcor++) {
        //  colorArray[ycor][xcor] = ogImage.getRGB(xcor, ycor);
    //  }
    //}
  }

//  public static void openFile(String imgFile) throws IOException{
//      File original = new File(imgFile);
//      ogImage = ImageIO.read(original);
//  }

//  private static int[][] getPixels(){
//        int width = ogImage.getWidth();
//        int height = ogImage.getHeight();
//        colorArray = new int[height][width];

//        for (int ycor = 0; ycor < height; ycor++) {
//           for (int xcor = 0; xcor < width; xcor++) {
//              colorArray[ycor][xcor] = ogImage.getRGB(xcor, ycor);
  //         }
  //      }

  //      return colorArray;
  //   }

  public static void setStuff(){
    width = ogImage.getWidth();
    height = ogImage.getHeight();
  }

  public static String toString(int input){
    return input + "";
  }

  public static ArrayList<String> grayscale(){
    ArrayList<String> pixels = new ArrayList<String>();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
         pixels.add(toString(ogImage.getRGB(x, y)));
      }
    }
    return pixels;
  }

  public int blur(int[] pixels){
    return 0;
  }

  public int sharpen(int[] pixels){
    return 0;
  }

  public static void main(String[] args) throws IOException{
    File original = new File("cake.jpg");
    ogImage = ImageIO.read(original);
    System.out.println(height);

  }
}
