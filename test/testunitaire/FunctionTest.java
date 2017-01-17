/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitaire;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author itu
 */
public class FunctionTest {
    
    public FunctionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertToTable method, of class Function.
     */
    @Test
    public void testInsertToTable() throws Exception {
        System.out.println("insertToTable");
        Personne o = new Personne();
        o.setNom("Ranoely");
        o.setPrenom("Hasina");
        String nomTable = "personne";
        Function instance = new Function();
        int expResult = 1;
        int result = instance.insertToTable(o, nomTable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of verifEmploye method, of class Function.
     */
    @Test
    public void testVerifEmploye() {
        System.out.println("verifEmploye");
        String employe = "Rakoto";
        Function instance = new Function();
        boolean expResult = true;
        boolean result = instance.verifEmploye(employe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateToTable method, of class Function.
     */
    @Test
    public void testUpdateToTable() throws Exception {
        System.out.println("updateToTable");
        Personne o = new Personne();
        o.setPrenom("Fenohasina");
        String nomTable = "personne";
        String[] nomColFiltre = new String[]{"nom"};
        String[][] filtre = new String[][]{{" = "},{"'Randria'"}};
        Function instance = new Function();
        int expResult = 1;
        int result = instance.updateToTable(o, nomTable, nomColFiltre, filtre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
}
