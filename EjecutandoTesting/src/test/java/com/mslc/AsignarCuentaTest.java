package com.mslc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AsignarCuentaTest {
	
	private Cliente c;
	
	@Before
	   public void setUp() throws Exception 
	   {
	      c = new Cliente();
	   }
	
	@Test
	public void testComprobarC1() {
		
		c = new Cliente(17, false, true);
		assertEquals(AsignarCuenta.comprobar(c),"No existe cuenta bancaria que se ajuste a ese perfil");
		
	}
	
	@Test
	public void testComprobarC2() {
		
		c = new Cliente(17, true, false);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Comfort");
		
	}
	
	@Test
	public void testComprobarC3() {
		
		c = new Cliente(18, true, false);
		assertEquals(AsignarCuenta.comprobar(c),"No existe cuenta bancaria que se ajuste a ese perfil");
		
	}
	
	@Test
	public void testComprobarC4() {
		
		c = new Cliente(18, true, true);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Vamos que tu puedes");
		
	}
	
	@Test
	public void testComprobarC5() {
		
		c = new Cliente(19, false, false);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Ahorra ahora que puedes");
		
	}
	
	@Test
	public void testComprobarC8() {
		
		c = new Cliente(19, false, true);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Saltando del nido");
		
	}
	
	@Test
	public void testComprobarC9() {
		
		c = new Cliente(24, true, true);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Vamos que tu puedes");
		
	}
	
	@Test
	public void testComprobarC10() {
		
		c = new Cliente(25, false, false);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Independizate que va siendo hora");
		
	}
	
	@Test
	public void testComprobarC12() {
		
		c = new Cliente(25, false, true);
		assertEquals(AsignarCuenta.comprobar(c),"Cuenta: Bienvenido a la vida adulta");
		
	}
	
	

}
