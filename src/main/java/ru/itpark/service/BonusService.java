package ru.itpark.service;

public class BonusService {
           public double calculate(double[] sales) {
               double sum=0;
               double percent = 0.05;
               double bonusLine=10_000;


        for (double sale : sales)
            if (sale > bonusLine) {
                sum+=(sale-bonusLine)*percent;
            }
               return sum;
           }

}
