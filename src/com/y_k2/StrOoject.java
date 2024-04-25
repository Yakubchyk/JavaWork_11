package com.y_k2;

public class StrOoject {
    public static void main(String[] args) {

        String in = "Papa";

        StringBuilder out = new StringBuilder(" ");
        for (int i = 0; i < out.length(); i++) {
            out.append(in.charAt(i));
            System.out.println(out);
        }
    }
}
