package com.gupaoedu.vip.pattern.adapater;


public class TripModeAdapter extends TripMode implements INewTripMode {

    public void driverBike(String name){
        processTripMode(new BikeAdapter());
    }

    public void driverCar(String name){
        processTripMode(new CarAdapter());
    }

    public void driverBus(String name){
        processTripMode(new BusAdapter());
    }

    @Override
    public void onFoot(String name) {
        super.onFoot(name);
    }

    public void processTripMode(Object obj) {
        IDriverAdapter clazz = null;
        try {
            clazz = (IDriverAdapter)obj.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        boolean lean = clazz.support(obj);
        if (lean){
             clazz.driverMode();
        }

    }
}
