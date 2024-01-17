package com.Fundamentals;
/*
You are creating a game where the player has to guess a number. Write a java program
that generates a random number between 1 and 10. Prompt the user to guess the number.
If the guess matches the generated number,display a message "Congratulations,
you guessed it right!" Otherwise,display a message "Oops,wrong guess!"
 */
import java.util.Random;
import java.util.Scanner;
public class Ifexer5 {
    public static void main(String[] args) {
        Random rand=new Random();
        int rand_int=rand.nextInt(1,10);
        System.out.println("Random integer: "+rand_int);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 1-10");
        int guess=sc.nextInt();
        if(rand_int==guess){
            System.out.println("Congratulations,you guessed it right!");
        }
        else{
            System.out.println("Oops,wrong guess!");
        }

    }
}
