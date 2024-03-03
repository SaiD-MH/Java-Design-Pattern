package StructuralPatterns.flyWeight;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    Map<PointType, PointIcon> map = new HashMap<>();


    public PointIcon getPointIcon(PointType type) {

        if (!map.containsKey(type)) {
            map.put(type, new PointIcon(type, null));
        }

        return map.get(type);
    }


}
