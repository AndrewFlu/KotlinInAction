package ch_05_lambdas.functional_interfaces;

import kotlin.Unit;

public class AlternativeTestDrive {
    public static void main(String[] args) {
        AlternativesKt.greetTheGuests( manager -> System.out.println(manager.getName()));

        AlternativesKt.greetTheGuestsFunctional( manager -> {
            System.out.println(manager.getName());
            return Unit.INSTANCE;
        });
    }
}
