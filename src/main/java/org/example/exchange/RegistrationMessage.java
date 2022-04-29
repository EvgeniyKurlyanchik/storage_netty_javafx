package org.example.exchange;

public class RegistrationMessage extends AbstractMessage{
    private final String login;
    private final String password;

    public RegistrationMessage(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
