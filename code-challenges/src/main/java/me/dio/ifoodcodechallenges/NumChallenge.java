package me.dio.ifoodcodechallenges;
import java.util.*;

public class NumChallenge {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] numbers = new int[2];

        for (int i = 0; i < 2; i++) numbers[i] = reader.nextInt();

        if(numbers[0] == numbers[1]){
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}