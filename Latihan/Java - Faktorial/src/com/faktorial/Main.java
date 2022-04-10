package com.faktorial;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input bilangan : ");
        int num = input.nextInt();
        int hasil = 1;
        
        for(int i = 2; i<num+1; i++){
            System.out.println(hasil + " x " + i + " = " + hasil * i);
            hasil*=i;
        }
    }
}