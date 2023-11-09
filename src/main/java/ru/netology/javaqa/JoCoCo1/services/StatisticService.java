package ru.netology.javaqa.JoCoCo1.services;
public class StatisticService {

    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax<income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}
