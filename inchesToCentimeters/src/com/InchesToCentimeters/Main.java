package com.InchesToCentimeters;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double sm = num * 2.54;

        System.out.println(sm);
    }
}
