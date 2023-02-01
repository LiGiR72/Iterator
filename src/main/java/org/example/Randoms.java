package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max + 1;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(min, max);
        }
    }

}
