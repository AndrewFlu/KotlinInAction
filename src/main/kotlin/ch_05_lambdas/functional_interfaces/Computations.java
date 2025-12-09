package ch_05_lambdas.functional_interfaces;

public class Computations {
    public void postponeComputation(int delay, Runnable computation) {
        System.out.println("Java postponeComputation()");
        System.out.println("Runnable.run()...");
        computation.run();
    }
}
