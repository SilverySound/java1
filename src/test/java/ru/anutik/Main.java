package ru.anutik;

public class Main {
    public static void main(String... args) {
        System.out.println("[" + Byte.MIN_VALUE +" , " +  Byte.MAX_VALUE + "]");
        System.out.println("Byte.SIZE  =   " + Byte.SIZE);
        byte b = 120;
        b += 19;
        System.out.println(b);
        System.out.println("[" + Short.MIN_VALUE +" , " +  Short.MAX_VALUE + "]");
        System.out.println("Short.SIZE  =   " + Short.SIZE);
        short s = -32768;
        s -= 1;
        System.out.println(s);
        System.out.println("[" + Integer.MIN_VALUE +" , " +  Integer.MAX_VALUE + "]");
        System.out.println("Short.SIZE  =   " + Integer.SIZE);
        int i = 2147483647;
        i *= 5;
        System.out.println(i);
        System.out.println("[" + Long.MIN_VALUE +" , " +  Long.MAX_VALUE + "]");
        System.out.println("Long.SIZE  =   " + Long.SIZE);
        long  l = Long.MAX_VALUE;
        l /= -9223372036854775808L;
        System.out.println(l);
        System.out.println("[" + Float.MIN_VALUE +" , " +  Float.MAX_VALUE + "]");
        System.out.println("Float.SIZE  =   " + Float.SIZE);
        float f1 = 10.1F;
        float f2 = 0.1F;
        System.out.println(f1 * f2);
        System.out.println("[" + Double.MIN_VALUE +" , " +  Double.MAX_VALUE + "]");
        System.out.println("Double.SIZE  =   " + Double.SIZE);
        double d1 = 10.10001;
        double d2 = 0.1;
        System.out.println(d1 / d2);
        System.out.println("[" + Boolean.FALSE + " , " +  Boolean.TRUE + "]");
        boolean x = true;
        boolean y = false;
        if (40 <= i) {
            System.out.println(x);}
        else {
            System.out.println(y);
        }
        System.out.println(i / d1);
        System.out.println(d1 % 123);
        System.out.println(i / d1 * d2);

    }
}

