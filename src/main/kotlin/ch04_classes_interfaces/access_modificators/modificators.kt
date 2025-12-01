package ch04_classes_interfaces.access_modificators

internal open class TalkativeButton {

    private fun yell() = println("Hey!")

    protected fun whisper() = println("Let's talk")
}

//fun TalkativeButton.giveSpeech() { // должны быть одинаковые  модификаторы видимости у класса и функции-расширения
//    yell() // невозможно получить доступ к private-функции
//    whisper() // невозможно получить доступ к proteced-функции
//}