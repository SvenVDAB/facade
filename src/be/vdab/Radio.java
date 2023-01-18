package be.vdab;

public class Radio implements Geluidsbron {
    public void start() {
        System.out.println("Radio gestart");
    }

    public void stop() {
        System.out.println("Radio gestopt");
    }
}
