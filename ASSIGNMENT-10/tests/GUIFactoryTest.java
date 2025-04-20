package tests.abstract_factory;

import org.junit.Test;
import static org.junit.Assert.*;
import creational_patterns.abstract_factory.*;

public class GUIFactoryTest {

    @Test
    public void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        Button btn = factory.createButton();
        assertEquals("Rendering Windows Button", btn.render());
    }

    @Test
    public void testMacFactory() {
        GUIFactory factory = new MacOSFactory();
        Button btn = factory.createButton();
        assertEquals("Rendering MacOS Button", btn.render());
    }
}
