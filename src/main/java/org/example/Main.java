package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many years young are you:");
        int yrsYoung = input.nextInt();

        int yearsLeftTillHundred = 100 - yrsYoung;
        System.out.println("You have " + yearsLeftTillHundred + " years till you turn 100.");


        input.close();
        }
    }
