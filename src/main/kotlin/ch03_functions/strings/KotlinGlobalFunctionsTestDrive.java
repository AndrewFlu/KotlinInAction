package ch03_functions.strings;

import java.util.List;

public class KotlinGlobalFunctionsTestDrive {
    public static void main(String[] args) {
        System.out.println(StringUtils.joinToString(
                        List.of(5, 15, 100),
                        " = ",
                        "{",
                        "}"
                )
        );
        System.out.println(StringExtensionsKt.getLastChar("Kotlin"));
    }
}
