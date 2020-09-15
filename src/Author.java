import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, char g, String e) {
        name = n;
        gender = g;
        email = e;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return this.name + "(" + this.gender + ") " + "email is " + this.email;
    }
}