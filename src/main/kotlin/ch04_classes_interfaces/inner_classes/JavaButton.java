package ch04_classes_interfaces.inner_classes;

import org.jetbrains.annotations.NotNull;

public class JavaButton implements View{
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {
        //TODO("")
    }

    public class ButtonState implements State {

    }
}
