/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    private static String[] args;

    public static void main(String[] args) {
       menu();
    }
        public static void menu(){
        Scanner sc=new Scanner(System.in);
        int cn;
        System.out.println("DANH SACH CHUC NANG");
        System.out.println("1:Giai phuong trinh bac nhat");
        System.out.println("2:Giai phuong trinh bac 2");
        System.out.println("3:tinh tien dien");
        System.out.println("4:Thoat ung dung");
        System.out.print("chon chuc nang:");
        cn=sc.nextInt();
        switch(cn){
            case 1:
                bai1.main(args);
                break;
            case 2:
                bai2.main(args);
                break;
            case 3:
                bai3.main(args);
                break;
            case 4:
                  System.exit(0);
                break;
            default:
                System.out.println("chọn sai");
                break;
             
        }
    }

}
