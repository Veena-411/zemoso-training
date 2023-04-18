package com.java.core;

public class WrapperClass {
    public static void main(String[] args) {
        Boolean bObj = true;
        Character cObj = 'r';
        Integer iObj = 90;
        Float fObj = 56.3f;
        Double dObj = 78.34567;
        Long lObj = 234567890L;
        boolean b = bObj.booleanValue();
        char c = cObj.charValue();
        int i = iObj.intValue();
        float f = fObj.floatValue();
        double d = dObj.doubleValue();
        long l = lObj.longValue();
        Integer i1 = Integer.valueOf(i);
        Character c1 = Character.valueOf(c);
        Float f1 = Float.valueOf(f);
        Double d1 = Double.valueOf(d);
        Long l1 = Long.valueOf(l);
        Boolean b1 = Boolean.valueOf(b);



    }
}
