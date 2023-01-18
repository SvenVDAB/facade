package be.vdab;

public class Stereoketen implements Geluidsbron {
    private final Versterker versterker = new Versterker();
    private final Equalizer equalizer = new Equalizer();
    private final Radio radio = new Radio();
    private final CDSpeler cdSpeler = new CDSpeler();
    private Geluidsbron geluidsbron;


    public void start() {
        versterker.start();
        equalizer.start();
    }

    public void stop() {
        if (geluidsbron != null) {
            geluidsbron.stop();
            geluidsbron = null;
        }
        versterker.stop();
        equalizer.stop();
    }

    public void startRadio() {
        if (!radio.equals(geluidsbron)) {
            if (geluidsbron.equals(cdSpeler)) {
                cdSpeler.stop();
            }
            radio.start();
            geluidsbron = radio;
        }
    }

    public void stopRadio() {
        if(radio.equals(geluidsbron)) {
            radio.stop();
            geluidsbron = null;
        }
    }

    public void startCDSpeler() {
        if (!cdSpeler.equals(geluidsbron)) {
            if (radio.equals(geluidsbron)) {
                radio.stop();
            }
            cdSpeler.start();
            geluidsbron = cdSpeler;
        }
    }

    public void stopCDSpeler() {
        if(cdSpeler.equals(geluidsbron)) {
            cdSpeler.stop();
            geluidsbron = null;
        }
    }
}
