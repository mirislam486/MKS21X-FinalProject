import java.awt.Image;
import java.awt.image.BufferedImage;
public class ImageFilters{
  private int[][] colorArray;
  public File imgFile;

  ImageFilters(){
    File imgFile = new File(imgFile);
    for(int i = 0; i < imgFile.getwidth(); i++){
      for(int z = 0; z < imgFile.getheight(); z++){
          colorArray[i][h] = imageFile(imgFile.getRGB(i, z));
      }
    }
  }

  public void grayscale(int[] pixels){

  }

}
