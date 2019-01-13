import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio;
public class ImageFilters{
  private int[][] colorArray;

  public ImageFilters(String imgFile){
    //File imgFile = new File(fileName);
    //for(int i = 0; i < imgFile.getwidth(); i++){
      //for(int z = 0; z < imgFile.getheight(); z++){
          //colorArray[i][h] = imageFile(imgFile.getRGB(i, z));
      //}
    //}
  }

  private void openFile(String imgFile){
    try{
      BufferedImage image = new ImageIO.read(new File(imgFile));
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + imgFile);
        }
  }

  public int grayscale(int ycor, int xcor, String imgFile){
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
