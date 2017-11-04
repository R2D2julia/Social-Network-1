package facebook.vertex.service;

import facebook.vertex.model.User;

public class RegistrationCongrats extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear"
                + " "
                + user.getName()
                + " "
                + user.getSurname()
                + " "
                + "you successfully registered on our website.";
    }
}
