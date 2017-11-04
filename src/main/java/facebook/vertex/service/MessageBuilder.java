package facebook.vertex.service;

import facebook.vertex.model.User;

public class MessageBuilder {

    public String build(User user) {
        return "Dear " + user.getName();
    }
}
