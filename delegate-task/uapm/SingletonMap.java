package com.gupaoedu.vip.pattern.delegate.uapm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonMap {

    private static Map<String,QChartMap> MAP_TYPE = new ConcurrentHashMap<String, QChartMap>();

    private SingletonMap(){}

    static {
        MAP_TYPE.put(EnumType.LINE_NAME.getName(),new LineMap());
        MAP_TYPE.put(EnumType.PIE_NAME.getName(),new PieMap());
        MAP_TYPE.put(EnumType.BAR_NAME.getName(),new BarMap());
    }

    public static QChartMap getInstance(String mapName){
        return MAP_TYPE.get(mapName);
    }

}
