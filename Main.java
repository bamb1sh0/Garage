package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addCar(new Car("Гошко Георгий", "MAZ", 5, 12, 19, "Москва-Минск", "Дрова"));
        garage.addCar(new Car("Лазуков Вадим", "VOLVO", 7, 13, 20, "Витебск-Москва", "Доски"));
        garage.addCar(new Car("Брагин Николай", "VOLVO", 10, 8, 23, "Брест-Москва", "Столы"));
        garage.addCar(new Car("Сачивко Евгений", "GAZ", 6));
        garage.addCar(new Car("Лапаник Пётр", "GAZ", 7));
        garage.addCar(new Car("Мороз Михаил", "VOLVO", 5));


        System.out.println(" Список всех водителей и автомобилей: ");
        System.out.println(garage);
        System.out.println("----- Список всех свободных водителей и автомобилей с грузоподъёмность более 5 тонн -----");
        System.out.println(garage.freeCar());
        System.out.println("----- Список всех водителей и автомобилей находящихся в рейсе с 10:00 до 20:00 -----");
        System.out.println(garage.notFreeCar());

    }
}

class Garage {
    public ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            String sCar = car.toString();
            sb.append(sCar);
        }
        return sb.toString();
    }

    public String notFreeCar() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            if (car.getRouteStartTime() >= 10 && car.getRouteEndTime() <= 20) {
                String sCar = car.toString();
                sb.append(sCar);
            }
        }
        return sb.toString();
    }

    public String freeCar() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            if (car.getCargo() == null && car.getLoadCapacity() > 5) {
                String sCar = car.toString();
                sb.append(sCar);
            }
        }
        return sb.toString();
    }
}



