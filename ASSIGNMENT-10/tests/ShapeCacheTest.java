package tests.prototype;

import org.junit.Test;
import static org.junit.Assert.*;
import creational_patterns.prototype.*;

public class ShapeCacheTest {

    @Test
    public void testCloneShape() {
        ShapeCache.loadCache();
        Shape clonedCircle = ShapeCache.getShape("1");
        assertNotNull(clonedCircle);
        assertEquals("Circle", clonedCircle.getType());
    }
}
