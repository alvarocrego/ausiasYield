/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.parameter;

import javax.servlet.http.HttpServletRequest;
import net.daw.bean.LenguajeBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro
 */
public class LenguajeParamTest {

    public LenguajeParamTest() {
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

    /*@Test
    public void testsGetterSetters() throws Exception {
        System.out.println("test: LenguajeBean");
TestHttpServletRequest request = TestHttpServletRequest();
       
        request.setAttribute("id", new Integer(1));
        request.setAttribute("nombre", new String("nombre"));
        LenguajeBean oLenguajeBean = new LenguajeBean();
        LenguajeParam oLenguajeParam = new LenguajeParam(request);
        oLenguajeBean = oLenguajeParam.loadId(oLenguajeBean);
        
        assertEquals("getId: devuelve 1", oLenguajeBean.getId(), 1);
        assertEquals("getNombre: devuelve nombre", oLenguajeBean.getNombre(), "nombre");
    }*/

}
