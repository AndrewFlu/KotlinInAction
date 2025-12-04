package ch04_classes_interfaces.singleton;

import java.util.List;

public class KotlinSingletonTestDrive {
    public static void main(String[] args) {
        List<MacBook> macbooks = new java.util.ArrayList<>(List.of(
                new MacBook("MacBook Air 14"),
                new MacBook("MacBook Pro 16 M1 Pro"),
                new MacBook("MacBook Pro 14 M1 Pro"),
                new MacBook("MacBook Pro 16 M3 Pro"),
                new MacBook("MacBook Pro 14 M4")
        ));

        macbooks.sort(MacBook.ModelComparator.INSTANCE);
        System.out.println(macbooks);
    }
}
