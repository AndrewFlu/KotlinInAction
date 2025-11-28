package ch03_functions;

import ch03_functions.strings.StringExtensionsKt;

public class ExpendableFunctionTestDrive {
    public static void main(String[] args) {
        String word = "Finance";
        char ch = StringExtensionsKt.lastChar(word);
        System.out.println("Last char for [" + word + "] is " + ch);
    }
}
