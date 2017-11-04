package facebook.vertex.service;

import facebook.vertex.model.User;

public class MessageService {

    public static void main(String[] args) {

        final User user = new User();
        user.setName("Alex");
        user.setSurname("Smirnov");
        MessageBuilder builder = new RegistrationCongrats(); //реализовали класс MessageBuilder через вызов другого класса

        final String message = builder.build(user);
        System.out.println(message);
    }
}
