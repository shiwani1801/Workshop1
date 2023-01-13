package com.bridgelabz.factorial;

//import java.util.Scanner;

public class FactorialOfNo {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter a no");
//        int n=scanner.nextInt();
        int fact = 1;
        //int n=10;
        for(int i=1;i<=n;i++){
            fact = fact * i;
            System.out.println(i+"!"+"="+fact);
        }
    }
}
