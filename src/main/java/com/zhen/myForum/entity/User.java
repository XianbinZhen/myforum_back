package com.zhen.myForum.entity;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int userId;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String profileImg;
    @Column
    private long createdAt;

    public User() {
    }

    public User(int userId, String username, String password, String profileImg, long createdAt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.profileImg = profileImg;
        this.createdAt = createdAt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profileImg='" + profileImg + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
