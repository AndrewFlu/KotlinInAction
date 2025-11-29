package ch04_classes_interfaces;

public class JButton implements Clickable{
    @Override
    public void click() {
        System.out.println("JavaButton has been clicked");
    }

    // код на Java не может использовать реализации по умолчанию из Kotlin
    @Override
    public void printProperty() {
        System.out.println("I am a clickable Java Button");
    }
}
