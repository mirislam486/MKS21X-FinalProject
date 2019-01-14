import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.DataBufferByte;
public class ImageFilters{
  public static int[][] colorArray;
  public static BufferedImage ogImage;
  public static String imgFile;

  public ImageFilters(String imgFile){
    int width = ogImage.getWidth();
    int height = ogImage.getHeight();
    colorArray = new int[height][width];

    for (int ycor = 0; ycor < height; ycor++) {
       for (int xcor = 0; xcor < width; xcor++) {
          colorArray[ycor][xcor] = ogImage.getRGB(xcor, ycor);
       }
    }
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

  public int[][] grayscale(int ycor, int xcor){
    for(int x = 0; x < ogImage.getWidth(); x++){
      for(int y = 0; y < ogImage.getHeight(); y++){
        colorArray[x][y] = 404040;
      }
    }
    return colorArray;
  }

  public int blur(int[] pixels){
    return 0;
  }

  public int sharpen(int[] pixels){
    return 0;
  }

  public static void main(String[] args) throws IOException{
    File original = new File("cake.jpg");
    System.out.println(colorArray);
  }
}
