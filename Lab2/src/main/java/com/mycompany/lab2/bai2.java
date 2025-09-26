/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
       double a,b,c,delta;
        Scanner sc= new Scanner(System.in);
        System.out.print("a=");
        a=sc.nextDouble();
        System.out.print("b=");
        b=sc.nextDouble();
        System.out.print("c=");
        c=sc.nextDouble();
        if (a==0) {
                if (b==0 && c==0) {
                System.out.println("Vo so nghiem");
                } else if (b==0) {
                System.out.println("Vo nghiem");
                }   else {
                System.out.println("Nghiem: "+(-c/b));
                }
        }   else{
                 delta=Math.pow(2, b)-4*a*c;
                 if (delta>0) {
                    System.out.println("Vo nghiem:");
                } else if (delta==0) {
                    System.out.println("Nghiem kep:"+(-b/2*a));
                }   else {
                    double x1=(-b+Math.sqrt(delta))/(2*a);
                    double x2=(-b-Math.sqrt(delta))/(2*a);
                    System.out.println("2 nghiem phan biet x1="+x1+",x2="+x2);
                }
            }
    }
}
