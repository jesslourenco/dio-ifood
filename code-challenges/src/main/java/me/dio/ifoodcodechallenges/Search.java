package me.dio.ifoodcodechallenges;
import java.util.*;

public class Search {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        String result = "";

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] == num){
                result = "Achei " + num + " na posicao " + i;
                break;
            }
        }

        if(result.isEmpty()){
            result = "Numero " + num + " nao encontrado!" ;
        }

        System.out.println(result);

    }
}
