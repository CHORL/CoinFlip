package com.Android.Project.coinflip;
//Class for generating a random number to use in deciding which side of the coin is to show
import java.util.Random;
//random utility to create numbers
public class RandomNumberGenerator {
    public static int randInt() {
        //Two int and an object to create a random number between one and two
        int min = 1;
        int max = 2;
        Random rand = new Random();


        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
        //randomNum is to be called upon when needed in main do decide outcome
    }

}
