package com.company;

public class Kosiarka extends Maszyna {
private boolean czyMelekser;
private boolean czyNaped;
private int liczbaOstrzy;
private rodzajSilnika rs;

public Kosiarka (String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rs , boolean czyMelekser, boolean czyNaped, int liczbaOstrzy){
    this.marka = marka;
    this.nazwa = nazwa;
    this.pojemnoscSilnika = pojemnoscSilnika;
    this.rs = rs;
    this.czyMelekser = czyMelekser;
    this.czyNaped = czyNaped;
    this.liczbaOstrzy = liczbaOstrzy;
}
    public boolean isCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }


    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }
    public String wyswietl(){
    return("Kosiarka{Marka:"+marka+"\n"
            +", nazwa:"+nazwa+"\n"
            +", pojemność silnika: "+pojemnoscSilnika+"\n"
            +", rodzaj silnika: "+rs+"\n"
            +", Czy posiada melekser?"+ czyMelekser+"\n"
            +", Czy posiada napęd?"+ czyNaped+"\n"
            +", Liczba Ostrzy: "+liczbaOstrzy+"}"+"\n");
    }
}
