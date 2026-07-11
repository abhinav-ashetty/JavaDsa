package com.shraddha.recursion;

public class Fibbonachi {
    public static void printFibonachi(int a, int b,int n){
        if(n==0) return;

        int c=a+b;
        System.out.println("a:"+a+"b:"+b);
        System.out.println(c);
        printFibonachi(b,c,n-1);
        System.out.println("b:"+b+"c:"+c);


    }
    public static void main(String[] args){
    int n=10,a=0,b=1;
        System.out.println(a);
        System.out.println(b);
    printFibonachi(a,b,n-2);
    }
}
