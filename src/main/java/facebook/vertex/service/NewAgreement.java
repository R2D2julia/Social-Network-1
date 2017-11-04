package facebook.vertex.service;

import facebook.vertex.model.User;

public class NewAgreement extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear"
                + " "
                + user.getName()
                + " "
                + user.getSurname()
                + " "
                + "congrats with new Service Agreement.";
    }
}
