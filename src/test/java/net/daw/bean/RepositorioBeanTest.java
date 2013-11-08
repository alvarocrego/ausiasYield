/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean;

import java.util.Date;
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
public class RepositorioBeanTest {

    public RepositorioBeanTest() {
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

    @Test
    public void testsGetterSetters() {
        System.out.println("test: RepositorioBean");
        RepositorioBean oRepositorioBean = new RepositorioBean();
        
        oRepositorioBean.setId(1);
        assertEquals("getId: devuelve 1", oRepositorioBean.getId(), 1);
        
        oRepositorioBean.setTitulo("titulo");
        assertEquals("getTitulo: devuelve titulo", oRepositorioBean.getTitulo(), "titulo");
        
        oRepositorioBean.setContenido("contenido");
        assertEquals("getContenido: devuelve contenido", oRepositorioBean.getContenido(), "contenido");
        
        oRepositorioBean.setId_usuario(2);
        assertEquals("getId_usuario: devuelve 2", oRepositorioBean.getId_usuario(), 2);
        
        oRepositorioBean.setId_lenguaje(3);
        assertEquals("getId_lenguaje: devuelve 3", oRepositorioBean.getId_lenguaje(), 3);
        
        oRepositorioBean.setId_documento(4);
        assertEquals("getId_documento: devuelve 4", oRepositorioBean.getId_documento(), 4);
        
        Date fecha = new Date();
        oRepositorioBean.setFecha(fecha);
        assertEquals("getId_documento: devuelve fecha", oRepositorioBean.getFecha(), fecha);
    }
}
