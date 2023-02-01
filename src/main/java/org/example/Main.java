package org.example;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r + " | #" + count++);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}