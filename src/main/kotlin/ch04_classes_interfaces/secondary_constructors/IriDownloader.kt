package ch04_classes_interfaces.secondary_constructors

import java.net.URI

class IriDownloader : Downloader {

    constructor(uri: URI) : super(uri) {
        // код
    }

    constructor(url: String?) : this(URI(url)) // делегирует реализацию другому конструктору класса
}