package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly = new RWOnly();

        // rwonly.name = "Rushikesh";
        // System.out.println(rwonly.name);

        rwonly.setName("Rushikesh");
        System.out.println(rwonly.getName());
    }
}