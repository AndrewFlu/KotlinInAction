package ch_10_higher_order_functions.function_call;


import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.List;

public class KotlinCollectionsTestDrive {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("MacBook Pro 15");
        strings.add("MacBook Pro 16");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
    }
}
