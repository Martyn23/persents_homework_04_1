package ru.itpark.service;

public class BonusService {

    public double calculate(double[] sales) {

    double percent = 0.05;
    double bonusLine=10_000;
    double result=0;

        for (double sale : sales)
            if (sale > 10_000) {
        result = (sale-bonusLine)*percent;
            }
        return result;
    }
}
