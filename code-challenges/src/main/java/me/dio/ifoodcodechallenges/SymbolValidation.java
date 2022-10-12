package me.dio.ifoodcodechallenges;

import java.util.*;

public class SymbolValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        if (s.contains("(")) {
            return s.contains(")");
        }

        if (s.contains("{")) {
            return s.contains("}");
        }

        if (s.contains("[")) {
            return s.contains("]");
        }
        return false;
    }
}