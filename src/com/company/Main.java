package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("please enter your input1");
        int input1 = myScanner.nextInt();
        System.out.println("please enter your input2");
        int input2 = myScanner.nextInt();

        int jam = input1 + input2;
        int tafrigh = input1 - input2;
        int zarb = input1 * input2;
        int taghsim = input1 / input2;
        System.out.println("jam=" + jam + "tafrigh=" + tafrigh + "zarb=" + zarb + "taghsim=" + taghsim);


    }
}

