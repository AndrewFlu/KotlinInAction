package ch_08_basic_types_collections_arrays.java_interface_impl;

import java.util.List;

public interface DataParser <T> {
    void parseData(String input, List<T> output, List<String> errors);
}
