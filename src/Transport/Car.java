package Transport;


import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String rubber;


    public Car(String brand, String model, int productionYear, String productionCountry, String color, Double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String rubber) {
        this.brand = brand == null || brand.trim().isEmpty() ? "default" : brand.trim();
        this.model = model == null || model.trim().isEmpty() ? "default" : model.trim();
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry.trim().isEmpty() ? "default" : productionCountry.trim();
        this.color = color == null || color.trim().isEmpty() ? "белый" : color;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.transmission = transmission == null || transmission.trim().isEmpty() || !transmission.trim().equals("АКП") || !transmission.trim().equals("МКП") ? "Не указано (АКП/МКП)" : transmission.trim();
        this.bodyType = bodyType == null || bodyType.trim().isEmpty() ? "Не указано" : bodyType;
        this.registrationNumber = registrationNumber == null || registrationNumber.trim().isEmpty() ? "Не указано" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 || numberOfSeats > 100 ? 2 : numberOfSeats;
        this.rubber = rubber == null || rubber.trim().isEmpty() ? "Не указано" : rubber;
    }

    public void changeTires(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                this.rubber = "зимняя";
                System.out.println("Установлена " + rubber + " резина");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.rubber = "летняя";
                System.out.println("Установлена " + rubber + " резина");
                break;
            default:
                System.out.println("Некорректно указан месяц, введите значение от 1 до 12");
        }
    }

    public void checkRegistrationNumber() {
        if (this.registrationNumber.trim().length() != 9) {
            System.out.println("Гос.номер должен состоять из 9 символов (х000хх000)");
        } else {
            char[] mas = this.registrationNumber.toCharArray();
            System.out.println(Character.isLetter(mas[0] & mas[4] & mas[5]) &
                    Character.isDigit(mas[1] & mas[2] & mas[3] & mas[6] & mas[7] & mas[8]) ?
                    "Гос.номер корректен" : "Гос.номер некорректен");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRubber() {
        return rubber;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
    }

    public void setColor(String color) {
        this.color = color == null || color.trim().isEmpty() ? "белый" : color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null ||
                transmission.trim().isEmpty() ||
                !transmission.trim().equals("АКП") ||
                !transmission.trim().equals("МКП") ?
                "Не указано (АКП/МКП)" : transmission.trim();
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null ||
                registrationNumber.trim().isEmpty() ?
                "Не указано" : registrationNumber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber == null || rubber.trim().isEmpty() ? "Не указано" : rubber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && numberOfSeats == car.numberOfSeats && brand.equals(car.brand) && model.equals(car.model) && engineVolume.equals(car.engineVolume) && color.equals(car.color) && productionCountry.equals(car.productionCountry) && transmission.equals(car.transmission) && bodyType.equals(car.bodyType) && registrationNumber.equals(car.registrationNumber) && rubber.equals(car.rubber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, registrationNumber, numberOfSeats, rubber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", rubber='" + rubber + '\'' +
                '}';
    }
}
