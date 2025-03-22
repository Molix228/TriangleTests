package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    // Boundary Value Tests
    @Test void testLowerBoundary() {
        assertEquals("Value of a is not in the range of permitted values", Triangle.classify(0, 10, 10));
        assertEquals("Value of b is not in the range of permitted values", Triangle.classify(10, 0, 10));
        assertEquals("Value of c is not in the range of permitted values", Triangle.classify(10, 10, 0));
    }

    @Test void testUpperB() {
        assertEquals("Value of b is not in the range of permitted values", Triangle.classify(10, 201, 10));
    }

    @Test void testUpperC() {
        assertEquals("Value of c is not in the range of permitted values", Triangle.classify(10, 10, 201));
    }

    @Test void testUpperBoundary() {
        assertEquals("Equilateral", Triangle.classify(200, 200, 200));
        assertEquals("Value of a is not in the range of permitted values", Triangle.classify(201, 10, 10));

    }

    @Test void testEquilateral() {
        assertEquals("Equilateral", Triangle.classify(100, 100, 100));
    }

    @Test void testIsosceles() {
        assertEquals("Isosceles", Triangle.classify(100, 100, 50));
        assertEquals("Isosceles", Triangle.classify(50, 100, 100));
        assertEquals("Isosceles", Triangle.classify(100, 50, 100));
    }

    @Test void testScalene() {
        assertEquals("Scalene", Triangle.classify(80, 100, 120));
    }

    @Test void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.classify(5, 20, 5));
        assertEquals("NotATriangle", Triangle.classify(1, 2, 3));
        assertEquals("NotATriangle", Triangle.classify(10, 5, 5));
    }

    @Test void testNegativeInputs() {
        assertEquals("Value of a is not in the range of permitted values", Triangle.classify(-1, 50, 50));
    }

    @Test void testZeroSide() {
        assertEquals("Value of a is not in the range of permitted values", Triangle.classify(0, 10, 10));
    }
}