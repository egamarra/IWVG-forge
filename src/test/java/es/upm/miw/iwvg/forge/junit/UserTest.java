package es.upm.miw.iwvg.forge.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.forge.junit.User;

public class UserTest {
	User usr;
	User usr2;
	
	@Before
	public void before() {
		usr= new User(14, "Edgar", "Gamarra");	
		usr2= new User(14, "celia", "CASTAÑEDA");	
	}	

	@Test
	public void testFullName() {
		assertEquals("Edgar Gamarra", usr.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("E.", usr.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(14, usr.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Edgar", usr.getName());
		assertEquals("Celia", usr2.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Gamarra", usr.getFamilyName());
		assertEquals("Castañeda", usr2.getFamilyName());
	}
 
}
