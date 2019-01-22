import java.util.Scanner;
public class Driver{
  public static void main(String[] args){

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("1. Grayscale\n2. Clear Canvas\n3. Image Info\n4. Warm Color\n5. Rainbow \n Which One: ");
    int input = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
    ImageFilters newFile = new ImageFilters("cake.jpg");

    if (input == 1){
      System.out.println(newFile.grayscale());


    } else if(input == 2){
      Scanner readi = new Scanner(System.in);

      System.out.println("Choose a number less than or equal to 1:");
      int choice = reader.nextInt();
      if(choice <= 1){
        System.out.println(newFile.clear(choice));
      } else{
        System.out.println("Please try again with a different Number :'(");
      }

    } else if(input == 3){
      System.out.println(newFile.info());


    } else if(input == 4){
      System.out.println(newFile.warmColor());


    } else if(input == 5){
      Scanner readagain = new Scanner(System.in);


      System.out.println("Choose an intensity:");

      int intensity = reader.nextInt();

      System.out.println(newFile.rainbow(intensity));
    }
      System.out.println("Done!");
      reader.close();
    }
  }
