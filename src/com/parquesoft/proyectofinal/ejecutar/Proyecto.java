package com.parquesoft.proyectofinal.ejecutar;

import com.parquesoft.proyectofinal.operaciones.Operaciones;

import javax.swing.JOptionPane;

import com.parquesoft.proyectofinal.herramientas.Herramientas;

public class Proyecto {

	public static void main(String[] args) {
		int opcionSeleccionada = Herramientas.mostrarMenu();
		try {
			switch (opcionSeleccionada) {
				case 1:
					Operaciones.sumar();
					break;
				case 2:
					Operaciones.restar();
					break;
				case 3:
					Operaciones.multiplicar();
					break;
				case 4:
					Operaciones.dividir();
					break;
				default:
					JOptionPane.showMessageDialog(null,"Ingrese un numero valido");
					Herramientas.mostrarMenu();
					break;
		    }
		} catch (Exception e) {
            Herramientas.mostrarMensaje(e.getMessage());
		}
	}
}


