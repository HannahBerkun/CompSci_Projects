//Hannah Berkun
//Period 5
//Program04
//This program will allow me to create an airline reservation system
import java.util.Scanner;
public class Program04
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int i=1,Class=0,y,x,b,c,f,seatNum,seat,d,quit=0,book=0,moving=0,e;
        String move=new String();
        String moveFc=new String();
        boolean E[]=new boolean[5];
        boolean FC[]=new boolean[5];
        System.out.println("\t\t\tWelcome to NorthEast Airlines"); 
        while (i>=0&&quit!=1){  
            b=1;
            c=1;
            d=0;
            e=1;
            f=1;
            for (int a=0; a<FC.length; a++){                                        //checks if flight is full

                if (FC[a]==false||E[a]==false)
                    d++;
            }
            if (d==0){
                System.out.println("This flight is full, Next flight leaves in 3 hours.");
                quit=1;
            }
            while (c==1&&quit!=1){
                if (moving==1||moving==2)                               
                    System.out.println(); 
                else {                                          
                    System.out.print("(1) first class,(2) economy, or (3) quit\t"); 
                    Class=sc.nextInt();
                    if (Class<1||Class>=4){
                        c=0;
                        System.out.println("\nThat is not a possible answer"); 
                    }
                    else if (Class==3)
                        quit=1;
                }
                c++;
            }
            if (Class==1||moving==2&&quit!=1)       {                      //brings you to first class when selected or moves if economy is full
                y=0;
                x=0;
                moving=0;
                while (x<=4){
                    seatNum=x+1;
                    if(FC[x]==false){
                        System.out.println("Seat #"+seatNum); 
                        y=1;
                        if (x==4)
                            System.out.println("are the available seats in first class.");
                    }
                    x++;
                }
                while (b==1&&quit!=1){
                    if(y==0&&Class==1){
                        System.out.println("No available seats in first class"); 
                        while(f==1){
                            System.out.print("(Y) move to economy or (N) to quit\t"); 
                            moveFc=sc.next();
                            if(moveFc.equalsIgnoreCase("Y")){
                                moving=1;
                            }
                            else if(moveFc.equalsIgnoreCase("N")){
                                System.out.println("Next flight leaves in 3 hours."); 
                                quit=1;
                            }
                            else {
                                System.out.println("That is not a possible answer.");
                                f=0;
                            }
                            f++;
                        }
                    }
                    else{
                        System.out.println("Please enter the number of the seat that you want");
                        System.out.println("Press 0 to quit");
                        seat=sc.nextInt();
                        seat=seat-1;
                        if (seat<=4&&seat>=0&&FC[seat]==false||seat==-1){               
                            while(e==1){
                                if (seat<=4&&seat>=0&&FC[seat]==false){
                                    FC[seat]=true;
                                    seat=seat+1;
                                    System.out.println("\nSeat #"+seat+" has been booked");
                                    seat=0;
                                }

                                System.out.print("Would you like to book another flight? (1) no,(2) yes\t");
                                book=sc.nextInt();
                                if (book==1)
                                    quit=1;
                                else if (book==2)
                                    System.out.println("");
                                else {
                                    e=0;
                                    System.out.println("That is not a possible answer");
                                }
                                e++;
                            }
                        }
                        else if (seat>=5&&seat<=9) {
                            System.out.println("That seat is in economy");
                            b=0;
                        }
                        else if (seat<=4&&seat>=0&&FC[seat]==true){
                            System.out.println("That seat has already been chosen");
                            b=0;
                        }
                        else {
                            System.out.println("That seat is not available");
                            b=0;
                        }
                    } 
                    b++;
                }

            }
            b=1;
            c=1;
            d=0;
            e=1;
            f=1;
            if (Class==2||moving==1&&quit!=1)       { 
                y=0;
                x=0;
                moving=0;
                while (x<=4){
                    seatNum=x+6;
                    if(E[x]==false){
                        System.out.println("Seat #"+seatNum); 
                        y=1;
                        if (x==4)
                            System.out.println("are the available seats in economy.");
                    }
                    x++;
                }
                while (b==1&&quit!=1){
                    if(y==0&&Class==2){
                        System.out.println("No available seats in economy"); 
                        while(f==1){
                            System.out.print("(Y) move to first class or (N) to quit\t"); 
                            move=sc.next();
                            if(move.equalsIgnoreCase("Y")){
                                moving=2;
                            }
                            else if(move.equalsIgnoreCase("N")){
                                System.out.println("Next flight leaves in 3 hours."); 
                                quit=1;
                            }
                            else {
                                System.out.println("That is not a possible answer.");
                                f=0;
                            }
                            f++;
                        }
                    }
                    else{
                        System.out.println("Please enter the number of the seat that you want");
                        System.out.println("Press 0 to quit");
                        seat=sc.nextInt();
                        seat=seat-6;
                        if (seat<=4&&seat>=0&&E[seat]==false||seat==-6){
                            while(e==1){
                                if (seat<=4&&seat>=0&&E[seat]==false){
                                    E[seat]=true;
                                    seat=seat+6;
                                    System.out.println("\nSeat #"+seat+" has been booked");
                                }
                                System.out.print("Would you like to book another flight? (1) no, (2) yes\t");
                                book=sc.nextInt();
                                if (book==1)
                                    quit=1;
                                else if (book==2)
                                    System.out.println("");
                                else {
                                    e=0;
                                    System.out.println("That is not a possible answer");
                                    seat=0;
                                }
                                e++;
                            }
                        }
                        else if (seat<=-1&&seat>=-5){
                            System.out.println("That seat is in first class");
                            b=0;
                        }
                        else if (seat<=4&&seat>=0&&E[seat]==true){
                            System.out.println("That seat has already been chosen");
                            b=0;
                        }
                        else {
                            System.out.println("That seat is not available");
                            b=0;
                        }
                    } 
                    b++;
                }

            }
            i++;
        }
        System.out.println("\t\t\tThank you for choosing NorthEast airlines!"); 
    }
}
