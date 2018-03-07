package Models;

/**
 * Created by isabellepotvin on 2018-03-07.
 */

public class User {

    private String user_id;
    private String phone_number;
    private String email;
    private String username;


    //Constructors

    public User(String user_id, String phone_number, String email, String username) {
        this.user_id = user_id;
        this.phone_number = phone_number;
        this.email = email;
        this.username = username;
    }

    public User(){

    }


    //GETTERS AND SETTERS

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //toString

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
