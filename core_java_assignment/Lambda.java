package com.java.core;

import java.util.ArrayList;
import java.util.List;

interface Drawable{
    public  void draw();
        }
interface Greeting{
    public void greet(String Name);
}
interface Addition{
    public int add(int a, int b);
}
public class Lambda {
    public static void main(String[] args) {
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Draw implementation without Lambda");
            }
        };
        d.draw();
        Drawable d1 = ()->{
                System.out.println("Draw implementation with Lambda");
        };
        d1.draw();
        Greeting g = (Name)->{
            System.out.println("Hello "+Name);
        };
        g.greet("Veena");
        Addition sum = (a,b)->(a+b);
        sum.add(9,7);
        Addition s1 = (int a,int b)->{
            return (a+b);
        };
        s1.add(16,9);
        List<Integer> Marks = new ArrayList<>();
        Marks.add(97);
        Marks.add(89);
        Marks.add(86);
        Marks.add(91);
        Marks.forEach((n)-> System.out.println(n));

    }
}
