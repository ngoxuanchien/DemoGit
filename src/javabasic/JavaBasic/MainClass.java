/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasic.JavaBasic;

import java.util.Scanner;

/**
 *
 * @author ngoxu
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fullname;
        int age;
        
        Scanner scan = new Scanner(System.in);
        // Nhap du lieu
        System.out.println("Nhap ten: ");
        fullname = scan.nextLine();
        System.out.println("Nhap tuoi");
        age = scan.nextInt();
        if (age < 6) {
            System.out.println("Hoc mau giao");
        } else if (age <= 11) {
            System.out.println("Hoc tieu hoc");
        } else if (age <= 15) {
            System.out.println("Hoc trung hoc");
        } else if (age <= 18) {
            System.out.println("Hoc pho thong");
        }
        // khoong phai lo
    }
    
}
