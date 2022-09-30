package me.dio.ifoodcodechallenges;
import java.util.*;

public class Fizzbuzz {
    public static void main(String[] args) {
        int NUM;

        Scanner input = new Scanner(System.in);
        NUM = input.nextInt();
        System.out.println(somatorio(NUM));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
