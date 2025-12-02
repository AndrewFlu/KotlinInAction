package ch04_classes_interfaces.secondary_constructors

import java.net.URI

class MyDownloader : Downloader {

    constructor(url: String?) : super(url){
        // код
    }

    constructor(uri: URI?) : super(uri) {
        // код
    }
}