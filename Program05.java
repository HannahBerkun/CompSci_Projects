//Hannah Berkun
//Period 5
//Program05
//This program will allow me to play the tortoise and the hare race.
import java.util.Scanner;
public class Program05
{
    public static void main(String args[]) throws java.lang.InterruptedException{
        Scanner sc=new Scanner(System.in);

        int x=0,y=0,z=0,a=-1,b=0,again,moveHare=0,moveTort=0,prevMoveTort=0,prevMoveHare=0,hMove,tMove;
        long speed=0;
        String race[]=new String[70];
        System.out.println("\t\t\tWelcome to the Tortoise and the Hare race");
        while (b==0){
            System.out.println("Please enter the speed of each frame in milliseconds (1000 = 1 sec)");
            speed=sc.nextLong();                                                                             //determines how fast each fram will go
            b++;
            if (speed<=0){
                b=0;
                System.out.println("That is not a possible answer");
            }
        }
        System.out.print("\f");
        while(x<=69) {                                                                                       //sets up the race 
            if (x==69)
                race[69]="|";
            else if (x==0)
                race[x]="|";
            else
                race[x]=" ";
            System.out.print(race[x]);
            x++;
        }
        Thread.sleep(speed);
        System.out.print("\f");
        while (y>=0){
            z=0;
            a=0;
            hMove=1+(int)(Math.random()*10);                                                                //determines what the move will be based on #
            tMove=1+(int)(Math.random()*10);
            if(hMove==3||hMove==4){
                moveHare+=9;
                if(moveHare>69)
                    moveHare=69;
            }
            else if (hMove==5){
                moveHare-=12;
                if(moveHare<0)
                    moveHare=0;
            }
            else if (hMove==6||hMove==7||hMove==8){
                moveHare+=1;
                if(moveHare>69)
                    moveHare=69;
            }
            else if(hMove==9||hMove==10){
                moveHare-=2;
                if(moveHare<0)
                    moveHare=0;
            }

            if(tMove==6||tMove==7){
                moveTort-=6;
                if(moveTort<0)
                    moveTort=0;
            }
            else if (tMove==8||tMove==9||tMove==10){
                moveTort+=1;
                if(moveTort>69)
                    moveTort=69;
            }
            else {
                moveTort+=3;
                if(moveTort>69)
                    moveTort=69;
            }
            y++;
            race[prevMoveHare]=" ";
            race[moveHare]="H"; 
            prevMoveHare=moveHare;

            race[prevMoveTort]=" ";
            race[moveTort]="T";
            prevMoveTort=moveTort;

            if(moveHare==moveTort&&moveHare!=69&&y!=0){
                race[moveTort]="OUCH!!";
            }
            while(z<=69) {
                System.out.print(race[z]);
                z++;
            }
            Thread.sleep(speed);
            System.out.print("\f");

            if (moveTort==69&&moveHare==69){
                System.out.print("It’s a tie.");
                y=-2;
            }
            else if(moveTort==69&&moveHare!=69){
                System.out.println("TORTOISE WINS!! YAY!!");
                y=-2;
            }
            else if(moveHare==69&&moveTort!=69){
                System.out.println("Hare wins. YUCH!!");
                y=-2;
            }

            while (a==0&&y==-2){
                System.out.println("Do you want to play again? Yes(1) or No(2)");
                again=sc.nextInt();
                if (again==1){                                                                                  //resets game
                    y=0;
                    a=-1;
                    x=0;
                    z=0; 
                    b=0;
                    again=0; 
                    moveHare=0;
                    moveTort=0;
                    prevMoveTort=0;
                    prevMoveHare=0;
                    speed=0;

                    while (b==0){
                        System.out.println("Please enter the speed of each frame in milliseconds (1000 = 1 sec)");
                        speed=sc.nextLong();
                        b++;
                        if (speed<=0){
                            b=0;
                            System.out.println("That is not a possible answer");
                        }
                    }
                    System.out.print("\f");
                    while(x<=69) {
                        if (x==69)
                            race[69]="|";
                        else if (x==0)
                            race[x]="|";
                        else
                            race[x]=" ";
                        System.out.print(race[x]);
                        x++;
                    }
                    Thread.sleep(speed);
                    System.out.print("\f");

                }
                else if(again==2)
                    a=-1;
                else{
                    System.out.println("That is not a possible answer");
                }
            }

        }
        System.out.println("\t\t\tThanks for playing!!!");
    }
}
