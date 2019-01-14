import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.DataBufferByte;
public class ImageFilters{
  public static int[][] colorArray;
  public static BufferedImage ogImage;
  public static String imgFile;

  public ImageFilters(String imgFile) throws IOException{
    openFile(imgFile);
    getPixels();
  }

  public static void openFile(String imgFile) throws IOException{
      File original = new File(imgFile);
      ogImage = ImageIO.read(original);
  }

  private static int[][] getPixels(){
        int width = ogImage.getWidth();
        int height = ogImage.getHeight();
        colorArray = new int[height][width];

        for (int ycor = 0; ycor < height; ycor++) {
           for (int xcor = 0; xcor < width; xcor++) {
              colorArray[ycor][xcor] = ogImage.getRGB(xcor, ycor);
           }
        }

        return colorArray;
     }

  public int grayscale(int ycor, int xcor){
    return 0;
  }

  public int blur(int[] pixels){
    return 0;
  }

  public int sharpen(int[] pixels){
    return 0;
  }

  public static void main(String[] args){
    imgFile = "cake.jpg";
    System.out.println(colorArray);
  }
}
