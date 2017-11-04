package facebook.vertex.service;

import facebook.vertex.model.User;

public class HappyBuilder extends MessageBuilder {

    @Override
    public String build(User user) {
        return super.build(user) + " " + user.getSurname() + " " + "Happy Birthday.";
    }
}
