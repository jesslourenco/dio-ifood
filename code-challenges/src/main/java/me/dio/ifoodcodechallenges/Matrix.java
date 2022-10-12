package me.dio.ifoodcodechallenges;

import java.util.*;
import java.util.Scanner;
import java.util.List;

public class Matrix {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];
        for (i = 0; i < N; i++)
        {
            nums[i] = input.nextInt();
        }

        for (i = 0; i < N; i++){
            if(nums[i] % 2 != 0){
                int odd = nums[i];

                for(int j = i+1; j < N; j++){
                    if(nums[j] % 2 ==0){
                        int even = nums[j];
                        nums[i] = even;
                        nums[j] = odd;
                        break;
                    }
                }
            }
        }
        for (int e : nums) { System.out.println(e);}
    }
}