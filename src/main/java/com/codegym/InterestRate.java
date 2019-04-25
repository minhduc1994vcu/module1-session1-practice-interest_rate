package com.codegym;

public class InterestRate {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Money: ");
        double money = input.nextDouble();
        System.out.println("Time (month): ");
        int month = input.nextInt();
        System.out.println("Interest rate: ");
        double interset_rate = input.nextDouble();

        double total_interset = 0;
        total_interset = money * (interset_rate / 100 / 12) * month;

        System.out.println("Total interset: " + total_interset);
    }
}

