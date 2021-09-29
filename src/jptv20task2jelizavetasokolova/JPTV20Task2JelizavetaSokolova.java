/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task2jelizavetasokolova;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV20Task2JelizavetaSokolova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввидите трёхзначное число: ");
        int cislo = scanner.nextInt();
        int sot = cislo % 10;
        int des = cislo / 10 % 10;
        int ed = cislo / 100;
        int sum = sot + des + ed;
        System.out.println("Сумма цифр: "+ sum);
    }
    
}
