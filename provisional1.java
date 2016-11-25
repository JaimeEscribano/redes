package Practica1_Jaime_Escribano;
import java.lang.String;

import java.net.InetAddress;

import java.net.UnknownHostException;


public class Practica1_Cliente {
		static void main(String[] args)throws UnknownHostException {
			//Se asigna a "servidor" el nombre de el server para poder cambiarlo cómodamente
			String servidor = new String("speedtest.tele2.net");
			
			//Obtenemos la dirección IP del server
			InetAddress direccion = InetAddress.getByName(servidor);
			
			//lo sacamos por pantalla(testeo)
			
			System.out.println(direccion.getHostAddress());
		}	
}
