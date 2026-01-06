package ch_11_generics.nullable;

import org.jetbrains.annotations.NotNull;

public interface JBox<T> {

    void put(@NotNull T element);
    void putIfNotNull(T element);
}
