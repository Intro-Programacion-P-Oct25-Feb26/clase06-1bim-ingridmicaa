/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejemplo06 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
        System.out.println("Ingrese placa del vehículo");
        String placa = entrada.nextLine();
        placa=placa.toLowerCase();
        String inicial= placa.substring(0, 1); 
        
        switch(inicial){
            case "P":
            case "p":    
            
                System.out.printf("Esta placa es de Pichincha:%s",placa);
                break;
         
            case "G":
            case "g":
                System.out.printf("Esta placa es de Guayas",placa);
                break; 
                
            default:
                System.out.println("Acceso incorrecto");
                break;   
        }
    }
}

