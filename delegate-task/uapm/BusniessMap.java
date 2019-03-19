package com.gupaoedu.vip.pattern.delegate.uapm;

public class BusniessMap {

    public String command(String cmd){
        QChartMap map = SingletonMap.getInstance(cmd);
        map.processMap(cmd);
        return null;
    }
}
