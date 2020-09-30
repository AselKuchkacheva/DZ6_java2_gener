package com.company;

public class BillForLight<B extends Number> implements Calculatable {
    private B meter;
    private B tarif;

    public BillForLight(B meter,B tarif) {
        this.meter = meter;
        this.tarif = tarif;
    }

    @Override
    public void calculate() {
       double summa = meter.doubleValue()*tarif.doubleValue();

        System.out.println(summa);
    }
}

