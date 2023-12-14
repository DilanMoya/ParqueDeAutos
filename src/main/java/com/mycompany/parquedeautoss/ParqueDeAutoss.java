/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parquedeautoss;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author xpro3
 */
public class ParqueDeAutoss {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        ArrayList<Auto> autoPartes= new ArrayList<>();
        
        System.out.println("Ingrese el numero de autos: ");
        int numero= leer.nextInt();
        
        for(int i=0;i<numero;i++){
            System.out.print("Ingrese la placa del auto " + (i+1) + " : ");
            String placa = leer.next();
            System.out.print("Ingrese el modelo del auto " + (i+1) + " : ");
            String modelo = leer.next();
            System.out.print("Ingrese el valor del auto " + (i+1) + " : ");
            double valor = leer.nextDouble();
            
            Auto auto = new Auto(placa,modelo,valor);
            autoPartes.add(auto);
        }
              
        double total=0;
        for(Auto auto : autoPartes){
            total += auto.getValor();
        }
        System.out.println("El valor total de valores registrados es: " + total);
        }
        
}
