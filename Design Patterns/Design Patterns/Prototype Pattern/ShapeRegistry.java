
package prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String key, Shape shape) {
        shapeMap.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = shapeMap.get(key);
        if (shape != null) {
            return shape.clone();
        }
        throw new IllegalArgumentException("Shape not found in registry: " + key);
    }
}
