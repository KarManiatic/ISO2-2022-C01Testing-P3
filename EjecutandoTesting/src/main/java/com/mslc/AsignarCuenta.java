package com.mslc;

public class AsignarCuenta {

	public static int edad = 18;
	public static boolean estudiante = true;
	public static boolean independizado = true; 

	public static void main(String[]args) {
		
		Cliente cliente = new Cliente(edad, estudiante, independizado);
		
		String cuenta = comprobar(cliente);
		
		System.out.println(cuenta);
	}
	
	public static String comprobar(Cliente cliente) {
		
		int edad = cliente.getEdad();
		boolean estudiante = cliente.isEstudiante();
		boolean independizado = cliente.isIndependizado();
		
		if(edad < 18 && estudiante && !independizado) 
			return "Cuenta: Comfort";
		
		else if(edad < 25 && estudiante && independizado) 
			return "Cuenta: Vamos que tu puedes";
		
		else if(edad > 18 && edad < 25 && !estudiante && !independizado) 
			return "Cuenta: Ahorra ahora que puedes";
		
		else if(edad > 18 && edad < 25 && !estudiante && independizado) 
			return "Cuenta: Saltando del nido";
		
		else if(edad >= 25 && !estudiante && !independizado)
			return "Cuenta: Independizate que va siendo hora";
		
		else if(edad >= 25 && !estudiante && independizado) 
			return "Cuenta: Bienvenido a la vida adulta";
		
		else return "No existe cuenta bancaria que se ajuste a ese perfil";
	}
	
}
