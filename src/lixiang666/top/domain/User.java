package lixiang666.top.domain;

public class User {
    private int id;
    private static String username;
    private static String password;
    public static String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
