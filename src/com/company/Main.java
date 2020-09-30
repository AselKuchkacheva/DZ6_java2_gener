package com.company;

public class Main {

    public static void main(String[] args) {
        BillForLight<Double> billForLight1 = new BillForLight<>(23.2, 1.7);
        BillForLight<Integer> billForLight2 = new BillForLight<>(23, 2);
        BillForLight<Float> billForLight3 = new BillForLight<>(25.254F, 2.355F);
        billForLight1.calculate();
        billForLight2.calculate();
        billForLight3.calculate();
    }
}
