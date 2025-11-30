package ch04_classes_interfaces.modificators.open_final_abstract

class ThemedButton : RichButton() {

    // все доступные функции (open) можно переопределить
    override fun animate() {}

    override fun printProperty() {}

    // а эту функция помечена final и её нельзя переопределить
//    override fun click() {}

}