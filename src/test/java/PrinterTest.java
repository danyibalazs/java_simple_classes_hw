import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        this.printer = new Printer(500, 1000);
    }

    @Test
    public void testGetPaper(){
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void testGetToner(){
        assertEquals(1000, printer.getToner());
    }


    @Test
    public void testPrintWithEnoughPaper(){
        printer.print(20, 5);
        assertEquals(400, printer.getPaper());
    }

    @Test
    public void testPrintWithoutEnoughPaper(){
        printer.print(50, 20);
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void testPrintWithToner(){
        printer.print(20, 5);
        assertEquals(900, printer.getToner());
    }
}
