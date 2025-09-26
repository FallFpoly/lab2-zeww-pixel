/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        double SoDien,TienDien;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so dien:");
        SoDien=sc.nextDouble();
        if (SoDien<=50) {
            TienDien=SoDien*1000;
            System.out.println("Tien Dien:"+TienDien);
        } else {
            TienDien=50*1000+(SoDien-50)*1200;
            System.out.println("TienDien:"+TienDien);
        }    }
}
