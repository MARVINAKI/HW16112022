package Forge;

public class Main {
    public static void main(String[] args) {

        FlowerWarehouse flower = new FlowerWarehouse();

        Human human1 = new Human("Максим", "Минск", 1989, "Бренд-менеджер");
        Human human2 = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 1992, "Продакт-менеджер");
        Human human4 = new Human("Артём", "Москва", 1995, "Директор по развитию бизнеса");
        Human human5 = new Human("Владимир", "Казань", 2001, "Безработный");


        Car car1 = new Car("Lada", "", 2015, "РФ", "", 1.7);
        Car car2 = new Car("Audi", "A8", 2020, "Германия", "чёрный", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0);
        Car car4 = new Car("Kia", "Sportage (4 gen)", 2018, "Южная Корея", "красный", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);


        /*Flower flower1 = new Flower("Роза", "красный", "Голландия", 35.59);
        Flower flower2 = new Flower("Хризантема", "розовый", null, 15, 5);
        Flower flower3 = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower flower4 = new Flower("Гипсофила", "  ", "Турция", 19.5, 10);*/

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