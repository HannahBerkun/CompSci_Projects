//Hannah Berkun
//Period 5
//Program10
//This program will allow me to print the number of stars the critc gives
import java.util.Scanner;
public class Program10
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int w=0,method,a;
        int rating[]={5,7,2,1,9,10,6,2,3,1};
        System.out.println("\t\t\tWelcome to the critic page!\n");
        System.out.println("Rater\tTheir Score\tNumber of Stars for the Meal\n");
        for (w=0; w<10; w++){                                   //goes through all 10 ratings 
            System.out.print(w+"\t"+rating[w]+"\t\t");
            a=rating[w];
            numStars(a);
            System.out.print("\n");
        }
    }

    public static void numStars (int a) {
        while(a>0){                                                             //prints out # of stars
                System.out.print("*");
                a--;
            }
        }
    }
/*
				Welcome to the critic page!

Rater	Their Score	Number of Stars for the Meal

0	5		*****
1	7		*******
2	2		**
3	1		*
4	9		*********
5	10		**********
6	6		******
7	2		**
8	3		***
9	1		*

 */