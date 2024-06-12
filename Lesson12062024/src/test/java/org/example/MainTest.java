package org.example;

import org.junit.jupiter.api.*;

import static org.example.Main.sum;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
//    @BeforeAll
//    static void beforeAll(){
//        System.out.println("Before all tests");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("After all tests");
//    }
//
//    @BeforeEach
//    void beforeInit() {
//        System.out.println("Before each test");
//    }
//
//    @AfterEach
//    void afterInit() {
//        System.out.println("After each test");
//    }

    @Test
    void sumCorrectValueOneTest() {
        int res = 6;
        assertEquals(res, sum(5, 1));
//        assertTrue(sum(4, 2) > 0);
    }

    @Test
    void sumReturnsIncorrectValueTest() {
        assertFalse(sum(2, 4) < 0);
        assertNull(null);
    }

    @Test
    void sumReturnsZeroTest() {
        assertEquals(0, sum(0,0));
    }

    @Test
    void sumCorrectValueTwoTest() {
        int res = 6;
        assertEquals(res, sum(2, 4));
    }

    @Test
    void sumCorrectValueThreeTest() {
        int res = 6;
        assertEquals(res, sum(3, 3));
    }

    @Test
    void sum2() {
        System.out.println("Test 2 method for sum function");
    }
}