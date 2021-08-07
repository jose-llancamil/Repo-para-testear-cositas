package com.company;

import TDAs.Cliente;
import TDAs.Cuenta;
import TDAs.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cuenta miCuentaCorriente = new CuentaCorriente(1, "Corriente", false, 999);
		List<Cuenta> miListaDeCuentas = new ArrayList<>();
		Cliente miCliente = new Cliente(0L, miListaDeCuentas);
		miListaDeCuentas.add(miCuentaCorriente);
		miCliente.setListaCuentas(miListaDeCuentas);

		boolean menu = true;
		while (menu != false) {
			System.out.println("**********************");
			System.out.println(""
			+ "[1] DAME PLATA. \n"
			+ "[2] DAME INFO. \n"
			+ "[3] CHAO PESCAO \n"
			);
			Scanner input = new Scanner(System.in);
			System.out.println("Que querí: ");
			try {
				var opcion = input.nextInt();
				if (opcion != 3){
					System.out.println("elegiste: "+opcion);
				}
				else {
					menu = false;
					System.out.println("Chao");
				}

			}
			catch (Exception e){
				System.out.println("ERROR");
			}
		}
	}
}