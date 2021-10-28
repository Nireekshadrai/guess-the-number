import java.lang.*;
import java.util.*;
class project
{
 public static void main(String[] args)
 {
     Scanner obj=new Scanner(System.in);
     int attempt=1,n=0,s=100;String t="";
     int secret=(int)(Math.random()*99+1);
     System.out.println("Welcome to Guess the Number Game \nYou are suuposed to guess the number to win the game");
     System.out.println("Game Rules: \n1.You have 6 attempts to guess the number \n2.Each time you guess wrong you lose 10 points \n3.Alphabets and Special characters are NOT allowed. Enter only numbers");
     do
     {
         if(attempt==1)
         {
         System.out.println("Enter a guess number from 1 to 100 \n");
        }
        else
        {
            System.out.println("Enter a guess number \n");
        }
         n=obj.nextInt(); 
         if(n>=1&&n<=100)
         {
             
             if(n==secret)
             {
                 System.out.println("ooHHohh!! Your number is correct! You win the game.");
                 System.out.println("Your score is: "+s);
                 break;
                }
            else if(n<secret&&attempt<6)
            {
                s=s-10;
                System.out.println("Your guess number is smaller than the real number");
            }
            else if(n>secret&&attempt<6)
            {
                s=s-10;
                System.out.println("Your Guess Number is greater than the real number");
            }
            if(attempt==6)
            {
                System.out.println("YOU LOST!!You have used all your chances!! \nThe secret number was "+secret);
                break;
            }
            attempt++;
        }
    
        else
        {
            System.out.println("Enter a valid integer number");
            break;
        }
    }while(n!=secret);
}
}

            

         
