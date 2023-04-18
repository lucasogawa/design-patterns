package com.ogawalucas.solid.singleresponsability;

public class ViolationChecker {

    public static boolean isValid(Pair pair) {
        var first = pair.first();
        var second = pair.second();

        try {
            Integer.parseInt(first);
        } catch (NumberFormatException nfe) {
            return false;
        }

        try {
            Integer.parseInt(second);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
