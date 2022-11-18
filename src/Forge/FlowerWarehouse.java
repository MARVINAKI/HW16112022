package Forge;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerWarehouse {
    private ArrayList<Flower> flowerWarehouse;
    private double sum = 0;
    private String flavor = "";
    private int lifeSpanOfFlavor = 50;

    public FlowerWarehouse() {
        this.flowerWarehouse = new ArrayList<Flower>();
    }

    public void addToWarehouse(String titleOfFlower, String flowerColor, String country, double cost) {
        flowerWarehouse.add(new Flower(titleOfFlower, flowerColor, country, cost, 3));
    }

    public void addToWarehouse(String titleOfFlower, String flowerColor, String country, double cost, int lifeSpan) {
        flowerWarehouse.add(new Flower(titleOfFlower, flowerColor, country, cost, lifeSpan));
    }

    public void removeFromWarehouse(String titleOfFlower) {
        Flower flowerRemove = null;
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                flowerRemove = flowerWarehouse.get(flowerWarehouse.indexOf(flower));
            }
        }
        Iterator<Flower> iterator = flowerWarehouse.iterator();
        while (iterator.hasNext()) {
            Flower flower = iterator.next();
            if (flower.equals(flowerRemove)) {
                iterator.remove();
            }
        }
    }


    public void addToFlavor(String titleOfFlower, int amount) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                lifeSpanOfFlavor = lifeSpanOfFlavor > flower.getLifeSpan() ? flower.getLifeSpan() : lifeSpanOfFlavor;
                sum += flower.getCost() * amount;
                flavor += " " + flower.getTitleOfFlower() + " - " + amount + "шт.";
            }
        }
    }

    public String getSumOfFlavor() {
        double percentOfEmpoloyee = (sum / 100) * 10;
        return "Букет: " + flavor + " На сумму: " + (sum + percentOfEmpoloyee) + " руб." + " Срок стояния (дней): " + lifeSpanOfFlavor;
    }

    public void printWarehouse() {
        for (Flower flower : flowerWarehouse) {
            System.out.print(flower.getTitleOfFlower() + " ");
            System.out.print(flower.getFlowerColor() + " ");
            System.out.print(flower.getCountry() + " ");
            System.out.print(flower.getCost() + " ");
            System.out.println(flower.getLifeSpan() + " ");
        }
    }

    public void printAmountFlowers() {
        System.out.println(flowerWarehouse.size());
    }
}
