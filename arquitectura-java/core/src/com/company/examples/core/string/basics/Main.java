package com.company.examples.core.string.basics;

public class Main {

    public static void main(String[] args) {

        String strLorem = "Lorem Ipsum is simply dummy text of the printing and typesetting";
        String strLoremWithSpaces = "    Lorem Ipsum is simply dummy text     ";
        System.out.println("Length: " + strLorem.length());
        System.out.println("First character: " + strLorem.charAt(0));
        System.out.println("UpperCase: " + strLorem.toUpperCase());
        System.out.println("LowerCase: " + strLorem.toLowerCase());
        System.out.println("Trim: " + strLoremWithSpaces.trim());
        System.out.println("Substring: " + strLorem.substring(0, 5));






    }

}
