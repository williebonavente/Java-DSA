package com.thealgorithms.bitmanipulation;

/**
 * Numbers Different Signs
 * @author Bama Charan Chhandogi
 */

public class NumbersDifferentSigns {

    public static boolean differentSigns(int num1, int num2) {
        return (num1 ^ num2) < 0;
    }
}