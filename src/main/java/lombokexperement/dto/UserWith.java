package lombokexperement.dto;

public class UserWith {
    String name;
    String passwor;

    public String getName() {
        return name;
    }

    public String getPasswor() {
        return passwor;
    }

    public UserWith withName(String name) {
        this.name = name;
        return this;
    }

    public UserWith withPasswor(String passwor) {
        this.passwor = passwor;
        return this;
    }
}

