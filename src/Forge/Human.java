package Forge;

import java.util.Objects;

public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;
    private static final String MESSAGE = "Информация не указана";

    public Human(String name, String town, String jobTitle) {
        this(name, town, 0, jobTitle);
    }


    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name == null || name.trim().isEmpty() ? MESSAGE : name.trim();
        this.town = town == null || town.trim().isEmpty() ? MESSAGE : town.trim();
        this.yearOfBirth = Math.abs(yearOfBirth);
        this.jobTitle = jobTitle == null || jobTitle.trim().isEmpty() ? MESSAGE : jobTitle.trim();
    }

    public void greetings() {
        if (name.equals(MESSAGE) || town.equals(MESSAGE) || jobTitle.equals(MESSAGE) || yearOfBirth == 0) {
            System.out.println("Для приветсвия недостаточно информации");
        } else {
            System.out.println("Привет! Меня зовут " + name + ". Я из города "
                    + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "
                    + jobTitle + ". Будем знакомы!");
        }
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth() {
        this.yearOfBirth = 0;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth <= 0 ? 0 : yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null || town.trim().isEmpty() ? MESSAGE : town.trim();
    }


    @Override
    public String toString() {
        return "Человек {" +
                " Имя=" + name +
                ", город='" + town + '\'' +
                ", год рождения='" + yearOfBirth + '\'' +
                ", должность='" + jobTitle + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && name.equals(human.name) && town.equals(human.town) && jobTitle.equals(human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town, jobTitle);
    }
}
