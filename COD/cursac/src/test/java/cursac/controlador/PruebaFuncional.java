/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mario Rodas
 */
public class PruebaFuncional extends SeleneseTestBase {
    
    @Before
    public void beforeClass() {
        selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://localhost:8098");
        selenium.start();        
    }
    
    @Test
    public void testSimple() throws Exception {
        selenium.open("/cursac");
        selenium.waitForPageToLoad("50000");
        selenium.type("id=txtCodigo", "101");
        selenium.click("id=btnPrePost");
        selenium.waitForPageToLoad("50000");
    }
    
}
