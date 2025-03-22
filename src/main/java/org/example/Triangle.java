package org.example;

public class Triangle {
    public static String classify(int a, int b, int c) {
        if(a <= 0 || a > 200) return "Value of a is not in the range of permitted values";
        if(b <= 0 || b > 200) return "Value of b is not in the range of permitted values";
        if(c <= 0 || c > 200) return "Value of c is not in the range of permitted values";

        if(a + b <= c || a + c <= b || b + c <= a) return "NotATriangle";

        if(a == b && b == c) return "Equilateral";
        if(a == b || b == c || c == a) return "Isosceles";
        return "Scalene";
    }
}
