package com.parquesoft.proyectofinal.operaciones;

import com.parquesoft.proyectofinal.herramientas.Herramientas;

public class Operaciones {
    
	
	
	 public static void sumar() throws Exception {
    	 int sumando, suma;
         sumando = Herramientas.solicitarNumeroEntero("primer","sumar");
         suma = Herramientas.solicitarNumeroEntero("segundo","sumar");

         if (suma == 0) { 
             throw new Exception("No se puede realizar una suma por 0");
         }
         
         int resultado = sumando + suma;
         String mensaje = "El resultado de sumar: " + sumando + "+" + suma + "=" + resultado;
         Herramientas.mostrarMensaje(mensaje);
    }

	 
	 public static void restar() throws Exception {
	    	int restando, resta;
	        restando = Herramientas.solicitarNumeroEntero("primer","restar");
	        resta = Herramientas.solicitarNumeroEntero("segundo","restar");

	        if (resta == 0) { 
	            throw new Exception("No se puede realizar una resta por 0");
	        }
	        
	        int resultado = restando - resta;
	        String mensaje = "El resultado de restar: " + restando + "-" + resta + "=" + resultado;
	        Herramientas.mostrarMensaje(mensaje);
	    }
	 
	 
	 public static void multiplicar() throws Exception{
		 int multiplicador, multi;
	        multiplicador = Herramientas.solicitarNumeroEntero("primer","multiplicar");
	        multi = Herramientas.solicitarNumeroEntero("segundo","multiplicar");

	        if (multi == 0) { 
	            throw new Exception("No se puede realizar una multiplicacion por 0");
	        }
	        
	        int resultado = multiplicador * multi;
	        String mensaje = "El resultado de multiplicar: " + multiplicador + "*" + multi + "=" + resultado;
	        Herramientas.mostrarMensaje(mensaje);
	    }

    public static void dividir() throws Exception {
        double numerador, denominador;
        numerador = Herramientas.solicitarNumeroDecimal("numerador","dividir");
        denominador = Herramientas.solicitarNumeroDecimal("denominador","dividir");

        if (denominador == 0) { 
            throw new Exception("No se puede realizar una division por 0");
        }
        
        double resultado = numerador / denominador;
        String mensaje = "El resultado de dividir: " + numerador + "/" + denominador + "=" + resultado;
        Herramientas.mostrarMensaje(mensaje);
    }
  

   

   


    
}