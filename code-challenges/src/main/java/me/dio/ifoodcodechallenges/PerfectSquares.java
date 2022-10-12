package me.dio.ifoodcodechallenges;


import java.util.*;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int minSquares = n;
        int max = findMaxSquare(n);
        List<Integer> aux = new ArrayList<>();

        for(int i = max; i > 1; i--){
            aux.add(i * i);

            for(int j = max-1; j > 0; j--){
                if(aux.stream().mapToInt(Integer::intValue).sum() + (j*j) == n) {
                    if(aux.size() + 1 < minSquares) {
                        minSquares = aux.size() + 1;
                    }
                    aux.clear();
                    break;
                } else if (aux.stream().mapToInt(Integer::intValue).sum() + (j*j) < n){
                    aux.add(j * j);
                    j++;
                }
            }
        }

        System.out.println(minSquares);
    }

    static int findMaxSquare(int num){
        int max = 1;

        for(int i = num-1; i > 1; i--){
            if(i * i < num){
                max = i;
                break;
            }
        }
        return max;
    }
}
