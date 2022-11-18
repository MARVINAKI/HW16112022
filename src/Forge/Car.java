package Forge;


import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, Double engineVolume) {
        this.brand = brand == null || brand.trim().isEmpty() ? "default" : brand.trim();
        this.model = model == null || model.trim().isEmpty() ? "default" : model.trim();
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry.trim().isEmpty() ? "default" : productionCountry.trim();
        this.color = color == null || color.trim().isEmpty() ? "белый" : color;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
    }


    @Override
    public String toString() {
        return "Аааавтомобиль {" +
                "Марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объём двигателя (литров)=" + engineVolume +
                ", цвет кузова='" + color + '\'' +
                ", год производства=" + productionYear +
                ", страна сборки='" + productionCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && brand.equals(car.brand) && model.equals(car.model) && engineVolume.equals(car.engineVolume) && color.equals(car.color) && productionCountry.equals(car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }
}
