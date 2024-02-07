package programacion;

import Factory.OperacionesFactory;
import componente.OperacionesCadenaImpl;
import componente.OperacionesCadenas;
import componente.OperacionesNumeros;
import componente.OperacionesNumerosImpl;
import componente.OperacionesNumerosProxy;

public class Principal {
	public static void main(String[] args) {
		
		/*OperacionesNumerosProxy objProxy = new OperacionesNumerosProxy();
		
		int sum = objProxy.sumar(7,3);
		int res = objProxy.restar(7,3);
		
		System.out.println("El resultado es: " + sum);
		System.out.println("El resultado es: " + res);*/
		
		OperacionesNumeros op = OperacionesFactory.crearNumeros(OperacionesNumeros.class);
		int res = op.sumar(7, 3);
		System.out.println("La suma es " +res);
		
		OperacionesCadenas opc = OperacionesFactory.crearCadenas(OperacionesCadenas.class);
		String result = opc.mayusculas("hola");
		System.out.println(result);
		
		OperacionesFactory.registrar(OperacionesNumeros.class , OperacionesNumerosImpl.class);
		OperacionesFactory.registrar(OperacionesCadenas.class, OperacionesCadenaImpl.class);
		
		OperacionesNumeros opNum = OperacionesFactory.crear(OperacionesNumeros.class);
		int resta = opNum.restar(1542, 1478);
		System.out.println("La resta es: "+resta);
		
		OperacionesCadenas opCad = OperacionesFactory.crear(OperacionesCadenas.class);
		System.out.println(opCad.mayusculas("marianela"));
	}

}