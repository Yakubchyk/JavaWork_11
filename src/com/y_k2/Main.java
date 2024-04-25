package com.y_k2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//
//        String str = "Hello World!";
//        char[] arrStr = str.toCharArray();
//        int lang = arrStr.length;
//        int a = 0;
//        char[] back = new char[lang];
//        while (a < lang) {
//            back[a] += arrStr[lang - 1 - a];
//            a++;
//        }
//
//        System.out.println(back);
//        System.out.println(arrStr);
//    }
//

//        public static void main(String[] args) {
//            String ex = "Hello World";
//            Stack<String> stack = new Stack<>();
//            for (char c : ex.toCharArray()) {
//                stack.push(String.valueOf(c));
//            }
//            int newSise = stack.size();
//
//            for (int i = 0; i < newSise; i++) {
//                System.out.print(stack.pop());
//
//            }
//        }
//    }

//        String str = "Papa";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.substring(0, i + 1));
//
//        }


        Scanner scanner = new Scanner(System.in);
        String userNumber = scanner.nextLine();
        String[] num = userNumber.split(",");
        int userLastNumber = scanner.nextInt();
        for (String i : num) {
            int t = Integer.parseInt(i);
            if (t < userLastNumber) {
                System.out.println(t);
            }
        }
    }
}


