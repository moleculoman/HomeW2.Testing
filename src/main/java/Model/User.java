package Model;

import lombok.Data;

import java.util.regex.Pattern;

@Data
public class User {
    private String login;
    private String email;

    private static final Pattern PATTERN = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public User(String login, String email) {
        this.login = login;
        if(PATTERN.matcher(email).matches()){
            this.email = email;
        }else throw new RuntimeException("Некорректный формат E-mail");
    }
    public User(){
    }
}
