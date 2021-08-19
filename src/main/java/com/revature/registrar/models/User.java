package com.revature.registrar.models;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.bson.Document;

/**
 * POJO
 * Basic User class with all user info and getters/setters
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private boolean isFaculty;
    private boolean isAdmin;

    public User() {
        super();
    }


    public User(String firstName, String lastName, String email, String username, String password, boolean isFaculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.isFaculty = isFaculty;
        this.isAdmin = false;

        this.id = String.valueOf(username.hashCode());
    }

    public String getId() {
        return id;
    }

    public void setId(){
        this.id = String.valueOf(username.hashCode());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void setUsername(String username){
        this.username = username;
        this.id = String.valueOf(username.hashCode());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFaculty() {
        return isFaculty;
    }

    public void setFaculty(boolean faculty) {
        isFaculty = faculty;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Document getAsDoc() {
        Document doc = new Document("firstName", getFirstName())
                .append("lastName",getLastName())
                .append("email", getEmail())
                .append("username", getUsername())
                .append("password", getPassword())
                .append("isFaculty", isFaculty())
                .append("id", getId())
                .append("isAdmin", isAdmin());
        return doc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && isFaculty == user.isFaculty && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, username, password, isFaculty);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isFaculty=" + isFaculty + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
