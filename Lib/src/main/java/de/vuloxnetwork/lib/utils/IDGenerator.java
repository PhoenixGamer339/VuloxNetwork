package de.vuloxnetwork.lib.utils;

import de.vuloxnetwork.lib.VuxolLib;

import java.util.Random;

public class IDGenerator {

    public static String generateInternalID() {
        String uid = generateUniquieID();

        //Todo: Algo für 100% random & unique

        return uid;

    }

    private static String generateUniquieID() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        for(int i=0; i < 4; i++) {
            builder.append(generateRandomChar());
        }
        builder.append("-");
        for(int i=0; i < 4; i++) {
            builder.append(generateRandomChar());
        }

        return builder.toString();
    }

    private static char generateRandomChar() {
        Random random = new Random();
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return characters.charAt(random.nextInt(characters.length()));
    }
}
