//Hannah Berkun
//Period 5
//Program06+
//This program will allow me to play 7 up
import java.util.Scanner;
public class Program060
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int v=1;
        while(v==1){
            System.out.println("\f");
            char ShowGrid[][]=new char[5][5];
            String seaOrShip[][]=new String[5][5];

            for(int x=0;x<5;x++)                                //makes all spaces on grid empty
                for (int y=0;y<5;y++)
                    seaOrShip[x][y]="Empty";

            System.out.println("Welcome to Seven Up!.\n");
            System.out.println("I am going to hide the #7 and you have TEN tries to guess it.\n");
            System.out.println("Enter coordinates of targets as follows: \n\tEnter # for the row <press enter> \n\tEnter # for column <press enter>");
            System.out.println("Example Below: \n3 \n1 \n");
            System.out.println("**KEY: ' '-Open, '*'-Miss, '7'-Hit\n");

            int positionX, positionY, i=1, numShots=0, numHits=0, pickRow, pickColumn, z, playAgain; 

            positionX=0+(int)(Math.random()*5);
            positionY=0+(int)(Math.random()*5);

            while (i==1){                                //makes spaces where 7 is "hidden"
                seaOrShip[positionX][positionY]="Hidden";
                i++;
            }

            while((numShots<10)&&(numHits!=1)){
                System.out.println("\t  1 2 3 4 5");

                for(int rowGrid=0;rowGrid<5;rowGrid++){
                    int row;
                    row=rowGrid+1;
                    System.out.print("\t" +row+ " ");

                    for(int columnGrid=0;columnGrid<ShowGrid[rowGrid].length;columnGrid++){ 
                        if(seaOrShip[rowGrid][columnGrid].equals("Empty")||seaOrShip[rowGrid][columnGrid].equals("Hidden"))
                            ShowGrid[rowGrid][columnGrid]=' ';
                        else if(seaOrShip[rowGrid][columnGrid].equals("Hit"))
                            ShowGrid[rowGrid][columnGrid]='7';
                        else if(seaOrShip[rowGrid][columnGrid].equals("Miss"))
                            ShowGrid[rowGrid][columnGrid]='*';

                        System.out.print(ShowGrid[rowGrid][columnGrid]+" ");
                    }
                    System.out.println();
                }

                System.out.println("\n Try #"+(numShots+1)+ " ready. \nEnter coordinates: ");
                pickRow=sc.nextInt();
                pickColumn=sc.nextInt();
                numShots++;

                for(int k=0; k<=5; k++)                       
                    if(pickRow==k)
                        pickRow=k-1;
                for(int j=0; j<=5; j++)                       
                    if(pickColumn==j)
                        pickColumn=j-1;
                if(seaOrShip[pickRow][pickColumn].equals("Hidden")){                            //determines if guess is a hit or miss
                    seaOrShip[pickRow][pickColumn]="Hit";
                    numHits++;
                }
                else if(seaOrShip[pickRow][pickColumn].equals("Empty"))
                    seaOrShip[pickRow][pickColumn]="Miss";

                System.out.println("\f\t\t"+seaOrShip[pickRow][pickColumn]+"!\n");
            }

            if(numHits==1)
                System.out.println("You have picked the 7!");

            else
                System.out.println("Time is up, you did not find the 7.");

            z=0;

            while(z==0){
                System.out.println("Would you like to play again? Yes (1),No (2)");
                playAgain=sc.nextInt();
                if(playAgain==1){
                    v=1;
                    z=1;
                }
                else if(playAgain==2){
                    v=0;
                    z=1;
                }
                else{
                    System.out.println("That is not a possible answer");
                    z=0;
                }

            }

        }
        System.out.println("Thanks for playing!");
    }
}
