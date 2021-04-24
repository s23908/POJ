package com.company;

public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected enum rodzajSilnika{
        silnikBenzynowy, silnikSpalinowy, silnikElektryczny, silnikDiesla
    }
}
