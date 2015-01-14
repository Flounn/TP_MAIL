package fr.mail.metier;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClasseTest {

	Classe c;

	/**
	 * Test while creating a new classe
	 */
	@Test
	public void testCreateClasse() {
		assertEquals(c.getNbEleves(), 0);
	}
	/**
	 * Test while adding a new eleve to the classe
	 */
	@Test
	public void testAddEleveToClasse() {
		int tailleOld = c.getNbEleves();
		Eleve e = new Eleve();
		c.addEleve(e);
		assertEquals(c.getNbEleves(), tailleOld + 1);
	}
	/**
	 * Test name attribut
	 */
	@Test
	public void testClasseName() {
		assertEquals("Fail dans le nom de la classe", c.getNom(), "M2 MIAGE IF");
	}

	@Before
	public void setUp()
	{
		c = new Classe("M2 MIAGE IF", 2015, "Finance", 27);
	}
	/**
	 * Tears down the test fixture.
	 *
	 * Called after every test case method.
	 */
	@After
	public void tearDown()
	{
	}


	@Test
	public void testFail() {
		assertEquals("Fail already : 0 == 1",0, 1);
	}

}
