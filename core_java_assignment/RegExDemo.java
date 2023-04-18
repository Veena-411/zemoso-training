package com.java.core;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("popular", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Java is a popular Programming Language");
        boolean matchFound = matcher.find();
        if(matchFound)
            System.out.println("Match Found");
        else
            System.out.println("Match not Found");
        System.out.println(Pattern.matches(".a.","cat"));
        System.out.println(Pattern.matches(".a.","cup"));
        System.out.println(Pattern.matches("[abc]","d"));
        System.out.println(Pattern.matches("[a-zA-Z]*@[a-zA-Z]*.[a-zA-Z]*", "abc@gmail.com"));
        System.out.println(Pattern.matches("[A-Z]+[a-zA-Z]*","Carrot"));
        System.out.println(Pattern.matches("[A-Z]{4}[0-9]*","ABN45"));
        System.out.println(Pattern.matches("[A-Z]{4}[0-9]*", "GOAL326"));
        System.out.println(Pattern.matches("[A-Z]{2,}[0-9]*","E212850"));
        System.out.println(Pattern.matches("[A-Z]{2,}[0-9]*","EMP212850"));
        System.out.println(Pattern.matches("[A-Z][A-Za-z]*\s[A-Z][A-Za-z]*","Veena Kadari"));
        System.out.println(Pattern.matches("[A-Z][A-Za-z]*\s[A-Z][A-Za-z]*", "veenakadari"));
        System.out.println(Pattern.matches("\\d","4"));
        System.out.println(Pattern.matches("\\d","a"));
        System.out.println(Pattern.matches("\\D","s"));
    }
}
