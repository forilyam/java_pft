package ru.stqa.pft.sandbox;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Point a = new Point(1,2);
        Point b = new Point(4,5);

        System.out.println(a.distance(a,b));
    }

}
