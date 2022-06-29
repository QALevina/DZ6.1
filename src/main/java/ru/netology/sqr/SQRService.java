package ru.netology.sqr;

public class SQRService {
    public int squareRootOfTheRange(int miniRangeLimit, int maxiRangeLimit) {
        int numOfIterations = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= miniRangeLimit && i * i <= maxiRangeLimit) {
                numOfIterations++;
            }
        }
        return numOfIterations;
    }
}
