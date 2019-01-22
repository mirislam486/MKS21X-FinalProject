import java.util.Scanner;
public class Driver{
  public static void main(String[] args){

    Scanner reader = new Scanner(System.in);
    System.out.println("1. Grayscale\n2. Clear Canvas\n3. Image Info\n4. Warm Color\n5. Rainbow \n Which One: "); //Allows the user to choose an effect
    int input = reader.nextInt();
//once finished
    ImageFilters newFile = new ImageFilters("cake.jpg"); //The image file being edited

    if (input == 1){
      System.out.println(newFile.grayscale()); //uses grascale


    } else if(input == 2){
      Scanner readi = new Scanner(System.in);

      System.out.println("Choose a number less than or equal to 1:"); //This allows the user to choose the color for the clear canvas option
      int choice = reader.nextInt();
      if(choice <= 1){
        System.out.println(newFile.clear(choice));
      } else{
        System.out.println("Please try again with a different Number :'("); //This is shown whenever an invalid number is given
      }

    } else if(input == 3){
      System.out.println(newFile.info()); //image info


    } else if(input == 4){
      System.out.println(newFile.warmColor()); //warm color


    } else if(input == 5){
      Scanner readagain = new Scanner(System.in);


      System.out.println("Choose an intensity:"); //Rainbow intensity chooser

      int intensity = reader.nextInt();

      System.out.println(newFile.rainbow(intensity));
    }
      System.out.println("Done!"); //Done is printed after any filter is implemented
      reader.close(); //closes user input 
    }
  }
