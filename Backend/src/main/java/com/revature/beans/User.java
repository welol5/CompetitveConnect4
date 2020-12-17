package com.revature.beans;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.Objects;


public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String username;
    @Column(name="pass")
    private String password;
    @Column(name = "profile_pic_path")
    private String profilePicFilePath;
    @Column(name = "skill_ranking")
    private Integer rank;

    public User() {
        id = 0;
        username = "";
        password = "";
        profilePicFilePath = "";
        rank = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePicFilePath() {
        return profilePicFilePath;
    }

    public void setProfilePicFilePath(String profilePicFilePath) {
        this.profilePicFilePath = profilePicFilePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(profilePicFilePath, user.profilePicFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, profilePicFilePath);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profilePicFilePath='" + profilePicFilePath + '\'' +
                '}';
    }
}
