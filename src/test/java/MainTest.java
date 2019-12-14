import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {



    @Test
    public void isPackageFitInBox() {

        Box box1 = new Box();
        box1.width = 1.0;
        box1.height = 2.0;
        box1.length = 3.0;

        Package workPackage = new Package();
        workPackage.width = 10.0;
        workPackage.height = 20.0;
        workPackage.length = 30.0;

        Main container = new Main();

        assertEquals(true, container.isPackageFitInBox(workPackage,box1));
    }
}