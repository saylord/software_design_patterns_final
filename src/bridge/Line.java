package bridge;

import bridge.interfaces.ILine;

public class Line implements ILine {
    // connection with IHero & HERONAMEHero classes (factory)

    @Override
    public void goTop() {
        System.out.println("Going to top.");
    }

    @Override
    public void goMid() {
        System.out.println("Going to mid.");
    }

    @Override
    public void goBottom() {
        System.out.println("Going to bottom.");
    }

    @Override
    public void goHome() {
        System.out.println("Going home.");
    }

}
