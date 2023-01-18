package be.vdab;

public class Main {
    public static void main(String[] args) {
        var stereoketen = new Stereoketen();
        stereoketen.start(); // start equalizer + versterker
        System.out.println();
        stereoketen.stopCDSpeler(); //doet niets
        System.out.println();
        stereoketen.startCDSpeler(); // start cd-speler
        System.out.println();
        stereoketen.stopRadio(); //doet niets
        System.out.println();
        stereoketen.startRadio(); // stopt cd-speler, start radio
        System.out.println();
        stereoketen.stop(); //stopt radio, equalizer en versterker
    }
}
