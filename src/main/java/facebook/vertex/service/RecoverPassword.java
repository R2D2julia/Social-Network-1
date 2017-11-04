package facebook.vertex.service;

import facebook.vertex.model.User;

public class RecoverPassword extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear " + user.getName() + " " + user.getSurname() + " you have changed password"
                + "\n" + "check your e-mail for new pass";
    }
}
