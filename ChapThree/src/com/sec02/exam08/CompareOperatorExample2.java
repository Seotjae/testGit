package com.sec02.exam08;

/*
작성자 : 최성재
작성일 : 2022.06.13
비교 연산자2
*/
public class CompareOperatorExample2 {

    public static void main(String[] args) {
        int v2 =1;
        double v3 = 1.0;
        System.out.println(v2 == v3); //true
        
        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); //false
        System.out.println((float)v4 == v5); //true
    }
}
