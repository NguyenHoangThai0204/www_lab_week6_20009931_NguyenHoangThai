package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name = "FirstName", columnDefinition = "varchar(50)")
    private String firstName;
    @Column(name = "MidName", columnDefinition = "varchar(50)")
    private String midName;
    @Column(name = "LastName", columnDefinition = "varchar(50)")
    private String lastName;
    @Column(name = "Mobile", columnDefinition = "varchar(15)")
    private String mobile;
    @Column(name = "Email", columnDefinition = "varchar(50)")
    private String email;
    @Column(name = "Password", columnDefinition = "varchar(35)")
    private String password;
    @Column(name="RegisteredAt")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime registeredAt;

    public User(String firstName, String midName, String lastName, String mobile, String email, String password) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registeredAt=" + registeredAt +
                ", lastLogin=" + lastLogin +
                ", intro='" + intro + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }

    public User() {
    }

    @Column(name="LastLogin")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime lastLogin;

    public User(long userId, String firstName, String midName, String lastName, String mobile, String email, String password, LocalDateTime registeredAt, LocalDateTime lastLogin, String intro, String profile) {
        this.userId = userId;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.registeredAt = registeredAt;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.profile = profile;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Column(name = "Intro")
    private String intro;
    @Column(name = "Profile")
    private String profile;
}
