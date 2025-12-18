package ch_08_basic_types_collections_arrays.java_interface_impl;

import java.io.File;
import java.util.List;

public interface FileContentProcessor {
    void processContents(File path, byte[] binaryContents, List<String> textContents);
}
