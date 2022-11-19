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


    public String getTitleOfFlower(String titleOfFlower) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                return flower.getTitleOfFlower();
            }
        }
        return null;
    }

    public String getFlowerColor(String titleOfFlower) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                return flower.getFlowerColor();
            }
        }
        return null;
    }

    public String getCountry(String titleOfFlower) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                return flower.getCountry();
            }
        }
        return null;
    }

    public Double getCost(String titleOfFlower) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                return flower.getCost();
            }
        }
        return null;
    }

    public int getLifeSpan(String titleOfFlower) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFlower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                return flower.getLifeSpan();
            }
        }
        return 0;
    }

    public void setTitleOfFLower(String titleOfFLower, String newTitle) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFLower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                flower.setTitleOfFlower(newTitle);
                flowerWarehouse.set(flowerWarehouse.indexOf(flower), new Flower(flower.getTitleOfFlower(), flower.getFlowerColor(), flower.getCountry(), flower.getCost(), flower.getLifeSpan()));
            }
        }
    }

    public void setFlowerColor(String titleOfFLower, String newColor) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFLower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                flower.setFlowerColor(newColor);
                flowerWarehouse.set(flowerWarehouse.indexOf(flower), new Flower(flower.getTitleOfFlower(), flower.getFlowerColor(), flower.getCountry(), flower.getCost(), flower.getLifeSpan()));
            }
        }
    }

    public void setCountry(String titleOfFLower, String newCountry) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFLower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                flower.setCountry(newCountry);
                flowerWarehouse.set(flowerWarehouse.indexOf(flower), new Flower(flower.getTitleOfFlower(), flower.getFlowerColor(), flower.getCountry(), flower.getCost(), flower.getLifeSpan()));
            }
        }
    }

    public void setCost(String titleOfFLower, double newCost) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFLower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                flower.setCost(newCost);
                flowerWarehouse.set(flowerWarehouse.indexOf(flower), new Flower(flower.getTitleOfFlower(), flower.getFlowerColor(), flower.getCountry(), flower.getCost(), flower.getLifeSpan()));
            }
        }
    }

    public void setLifeSpan(String titleOfFLower, int newLifeSpan) {
        for (Flower flower : flowerWarehouse) {
            if (titleOfFLower.trim().equalsIgnoreCase(flower.getTitleOfFlower())) {
                flower.setLifeSpan(newLifeSpan);
                flowerWarehouse.set(flowerWarehouse.indexOf(flower), new Flower(flower.getTitleOfFlower(), flower.getFlowerColor(), flower.getCountry(), flower.getCost(), flower.getLifeSpan()));
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
