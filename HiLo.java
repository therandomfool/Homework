package PairedProgramming;

public class HiLo {
    public static void main(String[] args) {
        int guess, count=1;
        double num = (int)(1+Math.random()*20);
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        System.out.print("Guess the number (bewteen 1 and 20): ");
            guess = kb.nextInt();
        
    while(guess != num) {
        if(guess < num) {
            System.out.print("Guess too low.");
            count++;
            
        }
        else{
            System.out.print("Guess is too high.");
            count++;
            
        }
        
        System.out.print(" Guess again (between 1 and 20): ");
            guess = kb.nextInt();
    }
    System.out.println("You guessed the number! You're awesome! You guessed it in "+ count +" guess(es).");
    count++;
    kb.close();
    }
}
