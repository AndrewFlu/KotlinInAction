package ch03_functions.strings;

import java.util.List;

public class KotlinGlobalFunctionsTestDrive {
    public static void main(String[] args) {
        System.out.println(JoinKt.joinToString(
                List.of(5, 15, 100),
                " = ",
                "{",
                "}"
                )
        );
    }
}
