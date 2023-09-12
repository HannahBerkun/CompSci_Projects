//Hannah Berkun
//Period 5
//Program11
//This program will allow me to print a solid square of asterisks whose side is specified in integer parameter side and one with any character and  whose side is specified in integer parameter side
import java.util.Scanner;
public class Program11
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int w=0,b,side;
        String fillCharacter = new String("*"); 

        System.out.println("Please enter the integer parameter side of the first square ");
        side=sc.nextInt();
        squareOfAsterisks(side);
        
        System.out.println("Please enter the integer parameter side of the second square ");
        side=sc.nextInt();
        System.out.println("Please enter the character for the second square ");
        fillCharacter=sc.next();
        squareOfAsterisks(side,fillCharacter);
    }

    public static void squareOfAsterisks (int side) {
        int b=side,a=side;
        while(a>0){                                                                     //prints the number of rows specified by input
            while(b>0){                                                                 //prints number of characters per row specified by input
                System.out.print("* ");
                b--;
            }
            System.out.println("");
            b=side;
            a--;
        }
    }
    
    public static void squareOfAsterisks (int side, String fillCharacter) {
        int b=side,a=side;
        while(a>0){                                                                     //prints the number of rows specified by input
            while(b>0){                                                                 //prints number of characters per row specified by input
                System.out.print(fillCharacter+" ");
                b--;
            }
            System.out.println("");
            b=side;
            a--;
        }
    }
}