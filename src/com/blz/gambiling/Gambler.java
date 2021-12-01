package com.blz.gambiling;

import java.nio.channels.ClosedSelectorException;
public class Gambler {
    // Initializing Variables
    public static final int STAKE_PER_DAY = 100;
   public static final int BET = 1;
   public static final int WIN = 1;
   public static final int LOOSE = 0;

     public static void dailyBet(){
         int cash = STAKE_PER_DAY;
         int option = (int) (Math.random() * 10 % 2) ;
         if (option == WIN ){
             cash += BET;
             System.out.println("Player has won " +cash);
         }else if(option ==LOOSE ){
             cash -= BET;

             System.out.println("Player has loose " +cash);
         }
     }
    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Simulation");
        dailyBet();

    }
}
