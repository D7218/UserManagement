package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "USER_DETAILS")
public class User {
   @Id
   @GeneratedValue
    private Integer userId;
@Column(name = "USERNAME")
   private String userName;
@Column(name = "USEREMAIL")
   private String userEmail;
@Column(name = "USERPHONE")
   private String userPhone;
@Column(name = "CREATEDATE",updatable = false)
   private LocalDate createdDate;
@Column(name = "UPDATEDATE",insertable = false)
   private LocalDate updatedDate;
@Column(name = "ISACTIVE")
   private Character isActive;

    public User(Integer userId, String userName, String userEmail, String userPhone, LocalDate createdDate, LocalDate updatedDate, Character isActive) {
      super();
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.isActive = isActive;
    }
    public User(){
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isActive=" + isActive +
                '}';
    }
}
