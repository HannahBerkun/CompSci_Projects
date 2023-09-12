//Hannah Berkun
//Period 5
//Program09
//This program will allow me to find the GPA of a student on a 100 scale and 4.0 scale
import java.util.Scanner;
public class Program09
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int w=0;
        System.out.println("\t\t\tWelcome to find that GPA!");
        while(w==0){
            int v=0,choose,num=0,playAgain,randomInRange,y=0,z=0,counter=0;
            double gpa,randomNum;

            System.out.println("\t\t\tEnter as many grades as you want!");
            System.out.println("\t\t\tAdd a grade then press enter to add a grade");
            System.out.println("\t\t\tOnce finished, input (-1) to find your GPA");
            while(z==0){
                choose=sc.nextInt();
                if (choose>=0&&choose<=100){
                    num=num+choose;
                    counter++;
                }
                else if(choose==-1){
                    z++;
                }
                else{
                    System.out.println("That is not a possible answer");
                }
            }
            gpa=(double) num/(double) counter;
            randomNum=randomInRange(gpa);                                       //brings average gpa to second method

            while(v==0){
                System.out.println("\nWould you like to play again? Yes (1),No (2)");
                playAgain=sc.nextInt();
                if(playAgain==1){
                    w=0;
                }
                else if(playAgain==2){
                    w=1;
                }
                else{
                    System.out.println("That is not a possible answer");
                    v=-1;
                }
                v++;
            }

        }
        System.out.println("Thanks for playing!");
    }

    public static double randomInRange (double gpa) {
        int sum=0;
        if (gpa>=90&&gpa<=100){                                                     //determines 4.0 scale based on average gpa
            System.out.print("Your GPA is 4 on the 4.0 scale\nYou had an average of "+gpa);
        }
        else if (gpa>=80&&gpa<=89){
           System.out.print("Your GPA is 3 on the 4.0 scale\nYou had an average of "+gpa);
        }
        else if (gpa>=70&&gpa<=79){
           System.out.print("Your GPA is 2 on the 4.0 scale\nYou had an average of "+gpa);
        }
        else if (gpa>=60&&gpa<=69){
           System.out.print("Your GPA is 1 on the 4.0 scale\nYou had an average of "+gpa);
        }
        else {
           System.out.print("Your GPA is 0 on the 4.0 scale\nYou had an average of "+gpa);
        }
        return sum;
    }
}