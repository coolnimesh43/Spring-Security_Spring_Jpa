package org.nimesh.spring_security.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "app_user")
public class AppUser implements Serializable {
    private static final long serialVersionUID = -5184569476969429641L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private long id;

    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name", nullable = true)
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "city", nullable = true)
    private String city;

    @Column(name = "zip", nullable = true)
    private String zip;

    @Column(name = "state", nullable = true)
    private String state;

    @Column(name = "country", nullable = true)
    private String country;

    @Column(name = "created_by", nullable = true)
    private String createdBy;

    @Column(name = "updated_by", nullable = true)
    private String updatedBy;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date updatedDate;

    @Column(name = "is_enabled", nullable = false)
    private Boolean isEnabled;

    public AppUser() {
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "AppUser [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + "]";
    }

    private AppUser(AppUserBuilder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.city = builder.city;
        this.zip = builder.zip;
        this.state = builder.state;
        this.country = builder.country;
        this.createdBy = builder.createdBy;
        this.updatedBy = builder.updatedBy;
        this.createdDate = builder.createdDate;
        this.updatedDate = builder.updatedDate;
        this.isEnabled = builder.isEnabled;
    }

    public static class AppUserBuilder {
        private long id;
        private String userName;
        private String password;
        private String firstName;
        private String middleName;
        private String lastName;
        private String email;
        private String city;
        private String zip;
        private String state;
        private String country;
        private String createdBy;
        private String updatedBy;
        private Date createdDate;
        private Date updatedDate;
        private Boolean isEnabled;

        public AppUserBuilder(String userName, String password, String firstName, String lastName, String email, Boolean isEnabled) {
            this.userName = userName;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.isEnabled = isEnabled;
        }

        public AppUserBuilder id(long id) {
            this.id = id;
            return this;
        }

        public AppUserBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public AppUserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AppUserBuilder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public AppUserBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AppUserBuilder country(String country) {
            this.country = country;
            return this;
        }

        public AppUserBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public AppUserBuilder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public AppUserBuilder createdDate(Date createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public AppUserBuilder updatedDate(Date updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public AppUser build() {
            return new AppUser(this);
        }

    }
}
