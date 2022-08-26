package ru.netology.sqr;
public class SQRService {

    public int calcCountSqr (int startRange, int endRange) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= startRange && sqr <= endRange) {
                count++;
            }
        }
        return count;
    }
}
