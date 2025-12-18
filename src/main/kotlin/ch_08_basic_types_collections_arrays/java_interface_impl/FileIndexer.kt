package ch_08_basic_types_collections_arrays.java_interface_impl

import java.io.File

class FileIndexer : FileContentProcessor {
    override fun processContents(
        path: File, // файл должен быть не null
        binaryContents: ByteArray?, // null допускается
        textContents: List<String>? // null вместо списка допускается
    ) {
        TODO("Not yet implemented")
    }
}