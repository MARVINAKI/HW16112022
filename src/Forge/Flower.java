package Forge;

public class Flower {

    private String flowerColor; // !?! проверить условие !?!
    private String titleOfFlower; // !?! проверить условие !?!
    private String country;
    private double cost;
    public int lifeSpan;


    public Flower(String titleOfFlower, String flowerColor, String country, double cost) {
        this(titleOfFlower, flowerColor, country, cost, 3);
    }

    public Flower(String titleOfFlower, String flowerColor, String country, double cost, int lifeSpan) {
        double scale = Math.pow(10, 2);
        this.titleOfFlower = titleOfFlower == null || titleOfFlower.trim().isEmpty() ? "Без названия" : titleOfFlower.trim();
        this.flowerColor = flowerColor == null || flowerColor.trim().isEmpty() ? "белый" : flowerColor.trim();
        this.country = country == null || country.trim().isEmpty() ? "Россия" : country.trim();
        this.cost = cost <= 0 ? (int) cost : (Math.ceil(cost * scale) / scale);
        this.lifeSpan = lifeSpan <= 0 ? 3 : lifeSpan;
        /*setTitleOfFlower(titleOfFlower);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);

        А можно так, через сеттеры??? Вроде работает

        */
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor == null || flowerColor.trim().isEmpty() ? "белый" : flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null || country.trim().isEmpty() ? "Россия" : country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        double scale = Math.pow(10, 2);
        this.cost = cost <= 0 ? (int) cost : (Math.ceil(cost * scale) / scale);
    }

    public String getTitleOfFlower() {
        return titleOfFlower;
    }

    public void setTitleOfFlower(String titleOfFlower) {
        this.titleOfFlower = titleOfFlower == null || titleOfFlower.trim().isEmpty() ? "Без названия" : titleOfFlower;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan <= 0 ? 3 : lifeSpan;
    }



}
