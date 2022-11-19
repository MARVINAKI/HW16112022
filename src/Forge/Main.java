package Forge;

import Transport.Car;

public class Main {
    public static void main(String[] args) {

        FlowerWarehouse flower = new FlowerWarehouse();

        Car.Key keyRemote = new Car.Key("Удаленный запуск двигателя");
        Car.Key keyKeyless = new Car.Key("Бесключевой доступ");

        Human human1 = new Human("Максим", "Минск", 1989, "Бренд-менеджер");
        Human human2 = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 1992, "Продакт-менеджер");
        Human human4 = new Human("Артём", "Москва", 1995, "Директор по развитию бизнеса");
        Human human5 = new Human("Владимир", "Казань", 2001, "Безработный");


        Car car1 = new Car("Lada", "", 2015, "РФ", "", 1.7, "МКП", "Седан", "а233аа702", 5, "летняя");
        car1.setKey(keyKeyless);
        Car car2 = new Car("Audi", "A8", 2020, "Германия", "чёрный", 3.0, "АКП", "", "а22323233аа702", 2, "зимняя");
        car2.setKey(keyRemote);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0, "АКП", "Седан", "ввв233702", 7, "летняя");
        Car car4 = new Car("Kia", "Sportage (4 gen)", 2018, "Южная Корея", "красный", 2.4, null, "паркетник", "а233аа702", -5, "демисезонная");
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, "КП", null, "", 5555, "летняя");

        car1.changeTires(1);
        car1.checkRegistrationNumber();




        flower.addToWarehouse("Роза             ", "красный", "Голландия", 35.59);
        flower.addToWarehouse("Хризантема", "       розовый   ", null, 15, 5);
        flower.addToWarehouse("Пион", null, "Англия", 69.9, 1);
        flower.addToWarehouse("Гипсофила", "           ", "Турция", 19.5, 10);
        flower.removeFromWarehouse("роза");
        flower.addToWarehouse("Роза             ", "красный", "Голландия", 35.59);
        flower.printWarehouse();

        flower.addToFlavor("роза    ", 3);
        flower.addToFlavor("Хризантема", 5);
        flower.addToFlavor("гипсофила", 1);
        System.out.println(flower.getSumOfFlavor());



    }
}