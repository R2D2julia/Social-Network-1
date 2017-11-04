package facebook.network.model;

public class User {

    private int age;
    private String name;
    private String surname;
    private String town;

    public User(int age, String name, String surname, String town) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.town = town;
    }

    public User() {
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "User" +
                "\n"
                + "age: " + age
                + "\n"
                + "name: " + name
                + "\n"
                + "surname: " + surname
                + "\n"
                + "town: " + town;
    }
}

