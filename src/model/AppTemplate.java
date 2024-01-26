package model;

import java.util.Scanner;

public class AppTemplate {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el monto: ");

        Cajero cajero = new Cajero("Cta Ahorros 154225454", sc.nextInt(),1);

        cajero.procesar("Cta Ahorros 12545548", 10 , menu());
        System.out.println("Ingrese el monto: ");
        CajeroAutomatico cAuto= new CajeroAutomatico("C 1646412", sc.nextInt() , 2);
        cAuto.procesar("c16165165", 35, menu());

    }

    public static int menu() {

        System.out.println("Escoja una opción: \n1. Depositar \n2. Retirar");
        return sc.nextInt();
    }

}
