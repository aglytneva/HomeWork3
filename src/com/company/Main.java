package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println( "   Задание 1.");
    int clientOS = 0;
    if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println( "  ");

        System.out.println( "   Задание 2.");
    int clientDeviceYear = 2015;
    if (clientDeviceYear < 2015 && clientOS ==0) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            if (clientDeviceYear <2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите приложение по ссылке.");
        }}
    System.out.println( "  ");

    System.out.println( "   Задание 3.");
        int year =2021;
        int divFour = year % 4;
        int divHundred = year % 100;
        int divFourHundred = year % 400;
        if ((divFourHundred == 0) || (divFour==0 && divHundred !=0 ) )  {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    System.out.println( "  ");

    System.out.println( "   Задание 4.");
        int minTimeOfDelivery = 1;
        int deliveryDistance = 95;
        int KTimeOfDelivery = (deliveryDistance-21) / 40;
        int AlltimeOfDelivery = minTimeOfDelivery*2+KTimeOfDelivery;
        if (deliveryDistance<=20) {
            System.out.println("Для доставки на дистанцию "+ deliveryDistance +" км потребуется "+minTimeOfDelivery + " день");
        }
        else {
            System.out.println("Для доставки на дистанцию "+ deliveryDistance + " км потребуется "+
                   +AlltimeOfDelivery+ " дней (я)");
        }
    }}

