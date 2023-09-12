//Hannah Berkun
//Period 5
//Program06
//This program will allow me to play battleship and use 2 dimensional arrays
import java.util.Scanner;
public class Program06
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int v=1;
        while(v==1){
            System.out.println("\f");
            char ShowGrid[][]=new char[8][10];
            String seaOrShip[][]=new String[8][10];

            String alphaRows[] ={"A","B","C","D","E","F","G","H"};
            int numShots=0,numHits=0,pickColumn,pickRow=99;

            String pickLetter;
            int Vert_or_Horiz,positionX,positionY,z=0,playAgain;

            for(int x=0;x<8;x++)                                //makes all spaces on grid empty
                for (int y=0;y<10;y++)
                    seaOrShip[x][y]="Empty";

            System.out.println("An enemy ship has been identified on the radar. \nYou have time for 25 shots before being destroyed.\n");
            System.out.println("Enter coordinates of targets as follows: \n\tEnter letter for the row <press enter> \n\tEnter # for column <press enter>");
            System.out.println("Example Below: \nA \n1 \n");
            System.out.println("**KEY: ' '-Open Water, '*'-Missed Shot, 'X'-Hit\n");

            Vert_or_Horiz=0+(int)(Math.random()*2);

            if(Vert_or_Horiz==1){
                positionX=0+(int)(Math.random()*4);
                positionY=0+(int)(Math.random()*10);

                for(int i=1; i<=4; i++){                                //makes spaces where ship is called "hidden"
                    seaOrShip[positionX][positionY]="Hidden";
                    positionX++;
                }
            }
            else if(Vert_or_Horiz==2){
                positionX=0+(int)(Math.random()*8);
                positionY=0+(int)(Math.random()*6);

                for(int j=1; j<=4; j++){
                    seaOrShip[positionX][positionY]="Hidden";
                    positionY++;
                }
            }

            while((numShots<25)&&(numHits!=4)){
                System.out.println("\t  0 1 2 3 4 5 6 7 8 9");

                for(int rowGrid=0;rowGrid<8;rowGrid++){
                    System.out.print("\t" +alphaRows[rowGrid]+ " ");

                    for(int columnGrid=0;columnGrid<ShowGrid[rowGrid].length;columnGrid++){ 
                        if(seaOrShip[rowGrid][columnGrid].equals("Empty")||seaOrShip[rowGrid][columnGrid].equals("Hidden"))
                            ShowGrid[rowGrid][columnGrid]=' ';
                        else if(seaOrShip[rowGrid][columnGrid].equals("Hit"))
                            ShowGrid[rowGrid][columnGrid]='X';
                        else if(seaOrShip[rowGrid][columnGrid].equals("Miss"))
                            ShowGrid[rowGrid][columnGrid]='*';

                        System.out.print(ShowGrid[rowGrid][columnGrid]+" ");
                    }
                    System.out.println();
                }

                System.out.println("\nShot #"+(numShots+1)+ " loaded and ready. \nEnter coordinates: ");
                pickLetter=sc.next();
                pickColumn=sc.nextInt();
                numShots++;

                for(int k=0; k<alphaRows.length; k++)                       
                    if(pickLetter.equalsIgnoreCase(alphaRows[k]))
                        pickRow=k;
                if(seaOrShip[pickRow][pickColumn].equals("Hidden")){                            //determines if guess is a hit or miss
                    seaOrShip[pickRow][pickColumn]="Hit";
                    numHits++;
                }
                else if(seaOrShip[pickRow][pickColumn].equals("Empty"))
                    seaOrShip[pickRow][pickColumn]="Miss";

                System.out.println("\f\t\t"+seaOrShip[pickRow][pickColumn]+"!\n");
            }

            if(numHits==4)
                System.out.println("You have sunk the enemy battleship. Your service for your country is much appreciated.");

            else
                System.out.println("Time is up, your ship has been hit and it is sinking to the oceanfloor.");

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
