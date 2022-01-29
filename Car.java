package com.company;

public class Car {


    private String driver; // водитель
    private int routeStartTime; //время начала маршрута
    private int routeEndTime; //время окончания маршрута
    private int loadCapacity; //грузоподъемность
    private String wayBill; //маршрут
    private String modelCar; //марка машины
    private String cargo; //груз

    public Car(String driver, String modelCar, int loadCapacity, int routeStartTime, int routeEndTime, String wayBill, String cargo) {
        this.driver = driver;
        this.routeStartTime = routeStartTime;
        this.routeEndTime = routeEndTime;
        this.loadCapacity = loadCapacity;
        this.wayBill = wayBill;
        this.modelCar = modelCar;
        this.cargo = cargo;
    }

    public Car(String driver, String modelCar, int loadCapacity) {
        this.driver = driver;
        this.loadCapacity = loadCapacity;
        this.modelCar = modelCar;
    }


    public String getDriver() {
        return driver;
    }

    public int getRouteStartTime() {
        return routeStartTime;
    }

    public int getRouteEndTime() {
        return routeEndTime;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getWayBill() {
        return wayBill;
    }

    public String getModelCar() {
        return modelCar;
    }

    public String getCargo() {
        return cargo;
    }


    @Override
    public String toString() {
        String result = "";
//        result = String.format("Машина: " + getModelCar() + ", грузоподъемность: " +getLoadCapacity() + ", водитель: " +getDriver()
//                + ", маршрут: " +getWayBill() + ", время начала маршрута: " +getRouteStartTime()
//                + ", время окончания маршрута: " +getRouteEndTime() + ", груз: " + getCargo());
//        return "Машина: " + getModelCar() + ", грузоподъемность: " +getLoadCapacity() + ", водитель: " +getDriver()
//                + ", маршрут: " +getWayBill() + ", время начала маршрута: " +getRouteStartTime()
//                + ", время окончания маршрута: " +getRouteEndTime() + ", груз: " + getCargo();
        result = String.format("%n< Машина: %s , Грузоподъёмность %s тонн, Водитель: %s%n " +
                        "Маршрут: %s , Время начала маршрута: %d:00 - Время окончания маршрута: %d:00 , Груз: %s >%n",
                getModelCar(), getLoadCapacity(), getDriver(), getWayBill(), getRouteStartTime(), getRouteEndTime(), getCargo());
        if (getCargo() == null)
            result = String.format("%n< Машина: %s , Грузоподъёмность %s тонн, Водитель: %s >%n", getModelCar(), getLoadCapacity(), getDriver());
        return result;
    }

}
