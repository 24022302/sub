/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sub;

import java.util.Scanner;

/**
 *
 * @author tonic
 */
public class Sub {

     public static void main(String[] args) {

        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Enter the student's marks: ");
            int marks = Scanner.nextInt();
            
           
        
        if (marks >= 75){
            System.out.println("  PASS WITH DISTICTION ");
            
        } else if (marks >50 && marks < 75){
            System.out.println("  pass");
           
        } else if ( marks == 49){
            System.out.println("  pass condoned");
             
        } else if (marks >=40 && marks <=49){
        System.out.println("  your qualify for sub");
        }else {   
        System.out.println("  failed  go home!!");
        }
     }
}

    }

