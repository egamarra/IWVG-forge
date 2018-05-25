package es.upm.miw.iwvg.forge.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.forge.junit.Fraction;

public class FractionTest {
	Fraction fraccion;
	@Before
	public void before() {
		fraccion=new Fraction(3,5);
	}

	@Test
	public void testFractionIntInt() {
		Fraction expected=new Fraction();
		assertEquals(1,expected.getNumerator());
		assertEquals(1,expected.getDenominator());
	}

	@Test
	public void testFraction() {
		assertEquals(3,fraccion.getNumerator());
		assertEquals(5,fraccion.getDenominator());
	}

	@Test
	public void testDecimal() {
		System.out.println(fraccion.decimal());
		assertEquals(0.6,fraccion.decimal() ,  10e-5);
	}

	@Test
	public void testGetNumerator() {
		assertEquals(3,fraccion.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(5,fraccion.getDenominator());
	}

}
