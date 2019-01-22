import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.DataBufferByte;
import java.util.*;
public class ImageFilters{
  public static BufferedImage ogImage;
  public static String imgFile;
  public int height;
  public int width;


  public ImageFilters(String imgFile){
    //File original = new File(imgFile);
    //ogImage = ImageIO.read(original);
      //BufferedImage ogImage = null;
  try {
  ogImage = ImageIO.read(new File(imgFile));
  } catch (IOException e) {
  }

  }




  public static String toString(int input){
    return input + "";
  }



  public boolean warmColor(){
    width = ogImage.getWidth();
    height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
        int oldRGB = ogImage.getRGB(x, y);
        int newRGB = oldRGB / 100;
        ogImage.setRGB(x, y, newRGB);
      }
    }
    try {
    File outputfile = new File("saved.jpg");
    ImageIO.write(ogImage, "jpg", outputfile);
} catch (IOException e) {

}
    return true;
  }

  public boolean grayscale(){
    width = ogImage.getWidth();
    height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
        int oldRGB = ogImage.getRGB(x, y);
          int newRGB = oldRGB / 350000;
          ogImage.setRGB(x, y, newRGB);
        }
    }
    try {
    File outputfile = new File("saved.jpg");
    ImageIO.write(ogImage, "jpg", outputfile);
} catch (IOException e) {

}
    return true;
  }

  public boolean rainbow(int intensity){ //A rainbow filter
    width = ogImage.getWidth();
    height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
        int oldRGB = ogImage.getRGB(x, y);
          int newRGB = oldRGB * intensity;
          ogImage.setRGB(x, y, newRGB);
        }
    }
    try {
    File outputfile = new File("saved.jpg");
    ImageIO.write(ogImage, "jpg", outputfile);
} catch (IOException e) {

}
    return true;
  }


  public boolean clear(int num){ //Turns the image completely black
    int width = ogImage.getWidth();
    int height = ogImage.getHeight();
    for(int x = 0; x < width; x++){
      for(int y = 0; y < height; y++){
        ogImage.setRGB(x, y, num);
      }
    }
    try {
    File outputfile = new File("saved.jpg");
    ImageIO.write(ogImage, "jpg", outputfile);
} catch (IOException e) {

}
    return true;
    }

  public String info(){
    try {
    File outputfile = new File("saved.jpg");
    ImageIO.write(ogImage, "jpg", outputfile);
} catch (IOException e) {

}
    return ogImage.toString();
  }


}
