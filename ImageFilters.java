import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio;
public class ImageFilters{
  private int[][] colorArray;
  public String imgFile;

  public ImageFilters(){
    File imgFile = new File(fileName);
    BufferedImage image = new ImageIO.read(new File(imgFile));
    //for(int i = 0; i < imgFile.getwidth(); i++){
      //for(int z = 0; z < imgFile.getheight(); z++){
          //colorArray[i][h] = imageFile(imgFile.getRGB(i, z));
      //}
    //}
  }

  public int grayscale(int[] pixels){
    return 0;
  }

  public int blur(int[] pixels){
    return 0;
  }

  public int sharpen(int[] pixels){
    return 0;
  }

  public static void main(String[] args){
    System.out.println(imgFile);
  }

}
