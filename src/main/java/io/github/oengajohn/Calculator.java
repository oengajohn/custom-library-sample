package io.github.oengajohn;

public class Calculator {
    public int sum(int a, int b, int... numbers) {
        int sum = a + b;
        for (var i : numbers) {
            sum += i;
        }
        return sum;
    }
}