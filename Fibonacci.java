/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author AMD
 */
public class Fibonacci {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int n, m = 0;
     int a1=1;
     int b2;
     System.out.print("¿cuantos nuemros quieres?: ");
    
    n = leer.nextInt();   
    for(int i = 1; i <= n; i++){
        b2= m;
        m = a1 + m;
        a1 = b2;
        System.out.println(a1);
         }
        }
    }
