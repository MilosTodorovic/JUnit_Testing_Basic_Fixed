/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitNum100;

import JUnitNum100.MessagingService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author misa
 */
public class MessagingServiceTest {
    
    public MessagingServiceTest() {
    }
    
    @Test (timeout = 2000)
    public void testPrintMessage() {
        MessagingService service = new MessagingService();
        service.printMessage();
    }
}
