package com.Counter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Main {

    public static void main(String[] args) {

        Counter numOne = new Counter();

        for(int i = 0; i < 5; i++) {
            numOne.add();
        }

        System.out.println(numOne.get());
        System.out.println(numOne.reset());

    }

    Counter c = new Counter();

    @Test
    void addMore() {
        c.add(5);
        assertEquals(5, c.get());
    }

    @Test
    void addOne() {
        c.add();
        assertEquals(1, c.get());
    }

    @Test
    void getZero() {
        assertEquals(0, c.get());
    }

    @Test
    void getInit() {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
        c.add();
        c.reset();
        assertEquals(0, c.get());
    }

    @Test
    void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
    }
}
