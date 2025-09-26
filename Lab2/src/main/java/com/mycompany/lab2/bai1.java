/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
       double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap a=");
        a=sc.nextDouble();
        System.out.print("nhap b=");
        b=sc.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("Vo so nghiem");
        } else if (a == 0) {
            System.out.println("Vo nghiem");
        } else {
            System.out.println("Nghiem: " + (-b / a));
        }
    }
}
