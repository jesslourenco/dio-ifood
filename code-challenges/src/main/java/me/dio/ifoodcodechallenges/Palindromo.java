package me.dio.ifoodcodechallenges;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String reverso = "";

        int len = (palavra.length()) - 1;

        for (int i = len; i > -1; i--){
            reverso += palavra.charAt(i);
        }

        if(palavra.equals(reverso)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }}