package com.Android.Project.coinflip;
//Class for generating a random number to use in deciding which side of the coin is to show
import java.util.Random;

public class RandomNumberGenerator {
    public static int randInt(int min, int max) {
        min = 1;
        max = 2;
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}
