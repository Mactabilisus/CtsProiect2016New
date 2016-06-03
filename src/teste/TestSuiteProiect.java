package teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteProiect extends TestCase{

	public static TestSuite suite(){
		TestSuite colectie = new TestSuite();
//		colectie.addTestSuite(TesteFisier.class);
		//colectie.addTest(new TestePacketeWon("testDenumirePachet"));
		colectie.addTestSuite(TestePacketeWon.class);
		return colectie;
	}

}
