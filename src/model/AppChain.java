package model;

import impl.Banco;
import impl.Director;
import impl.EjecutivoCuenta;
import impl.Gerente;
import impl.LiderEjecutivo;

public class AppChain {

    public static void main(String[] args) {

        // Configurar la cadena de aprobadores
        Banco banco = new Banco();
        EjecutivoCuenta ejecutivo = new EjecutivoCuenta();
        LiderEjecutivo lider = new LiderEjecutivo();
        Gerente gerente = new Gerente();
        Director director = new Director();

        banco.setNext(ejecutivo);
        ejecutivo.setNext(lider);
        lider.setNext(gerente);
        gerente.setNext(director);

        // Realizar la solicitud de préstamo
        banco.solicitudPrestamo(12000);
    }
}
