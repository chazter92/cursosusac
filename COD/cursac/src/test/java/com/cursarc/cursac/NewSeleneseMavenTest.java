/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursarc.cursac;

import com.thoughtworks.selenium.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author RITA
 */
public class NewSeleneseMavenTest extends SeleneseTestBase {
    
    @Before
    public void beforeClass() {
        selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://localhost:8090");
        selenium.start();
    }
    
    @Test
    public void testSimple() throws Exception {
        selenium.open("/cursac");
        selenium.waitForPageToLoad("30");
        selenium.type("name=txtNum1", "2");
        selenium.type("name=txtNum2", "6");
        selenium.click("id=btnSuma");
        selenium.waitForPageToLoad("50");
    }
    
}
