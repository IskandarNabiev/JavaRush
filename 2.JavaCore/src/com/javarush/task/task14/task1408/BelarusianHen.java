package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    int N = 1;
    @Override
    int getCountOfEggsPerMonth() {
        return N;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
