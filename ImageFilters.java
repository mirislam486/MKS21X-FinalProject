import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.WritableRaster;
import java.awt.image.DataBufferByte;
public class ImageFilters{
  public int[][] colorArray;
  public BufferedImage ogImage;

  public ImageFilters(String imgFile) throws IOException{
    openFile(imgFile);
    //openFile("cake.jpg");
    //File imgFile = new File(fileName);
    //for(int i = 0; i < ogImage.getwidth(); i++){
      //for(int z = 0; z < ogImage.getheight(); z++){
          //colorArray[i][z] = ogImage.getRGB(i, z);
      //}
    //}
  }

  public void openFile(String imgFile) throws IOException{
    //imgFile = "cake.jpg";
    //try{
      File original = new File(imgFile);
      ogImage = ImageIO.read(original);
      WritableRaster raster = ogImage .getRaster();
      //DataBufferByte data = (DataBufferByte) raster.getDataBuffer();
    //} catch (FileNotFoundException e) {
        //System.out.println("File not found: " + imgFile);
        //}
    //try{
      //BufferedImage image = ImageIO.read(new File(imgFile));
    //} catch (FileNotFoundException e) {
      //  System.out.println("File not found: " + imgFile);
        //}
  }

  public void getWidth(){

  }

  public BufferedImage grayscale(int ycor, int xcor){

  }

  public int blur(int[] pixels){
    return 0;
  }

  public int sharpen(int[] pixels){
    return 0;
  }


}
