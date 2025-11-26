package ch03_functions;

import java.util.List;

import static ch03_functions.StringFunctionsWithOverloadsKt.joinToStringByOverloads;

public class StringFunctionOverloadsTestDrive {
    public static void main(String[] args) {
        List<String> automobiles = List.of("Audi", "BMW", "Mercedes-Benz");

        System.out.println(joinToStringByOverloads(automobiles));
        System.out.println(joinToStringByOverloads(automobiles, " / "));
        System.out.println(joinToStringByOverloads(automobiles, " \\ ", "< ", " ))"));
    }
}
