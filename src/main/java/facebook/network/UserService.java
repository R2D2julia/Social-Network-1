package facebook.network.service;

import facebook.network.data.Database;
import facebook.network.model.User;
import vertex.counter.VertexCounter;

import java.util.*;

public class UserService {

    public static void main(String[] args) {

        int age = 33;
        String name = "Julia";
        String surname = "Demska";
        String town = "Donetsk";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of method: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1: getAllUsers();
                break;
            case 2: getFirstUser();
                break;
            case 3: getLastUser();
                break;
            case 4: System.out.println("Result getByName: " + "\n" + getByName(name) + "\n");
                break;
            case 5: System.out.println("Result getBySurname: " + "\n" + getBySurname(surname) + "\n");
                break;
            case 6: System.out.println("Result getByAge is: " + "\n" + getByAge(age) + "\n");
                break;
            case 7: System.out.println("Result getByTown is: " + "\n" + getByTown(town) + "\n");
                break;
            default:
                System.out.println("You entered wrong number.");
                break;
        }
        scanner.close();

        final VertexCounter vertexCounter = new VertexCounter();
        final int unicode = vertexCounter.countUnicode("text");
        System.out.println(unicode);
    }

    private static void getAllUsers() {
        List<User> users = Database.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void getFirstUser() {
        System.out.println("First user is " + "\n" + Database.getUsers().get(0) + "\n");
    }

    private static void getLastUser() {
        System.out.println((("Last user is " + "\n" + Database.getUsers().get(Database.getUsers().size() - 1) + "\n")));
    }

    private static List<User> getByName(String name) {
        List<User> users = Database.getUsers();
        List<User> nameList = new LinkedList<>();
        for (User user : users) {
            if (name.equals(user.getName())) {
                nameList.add(user);
            }
        }
        return nameList;
    }

    private static List<User> getBySurname(String surname) {
        List<User> users = Database.getUsers();
        List<User> surnameList = new LinkedList<>();
        for (User user : users) {
            if (surname.equals(user.getSurname())) {
                surnameList.add(user);
            }
        }
        return surnameList;
    }

    private static List<User> getByAge(int age) {
        List<User> users = Database.getUsers();
        List<User> ageList = new LinkedList<>();
        for (User user : users) {
            if (age == user.getAge()) {
                ageList.add(user);
            }
        }
        return ageList;
    }

    private static List<User> getByTown(String town) {
        List<User> users = Database.getUsers();
        List<User> townList = new LinkedList<>();
        for (User user : users) {
            if (town.equals(user.getTown())) {
                townList.add(user);
            }
        }
        return townList;
    }
}


