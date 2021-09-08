package uz.doston.dtoentitymapper.model;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Long accId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String country;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private User userAccount;

    public Address() {
    }

    public Address(Long id,
                   Long accId,
                   String address1,
                   String address2,
                   String address3,
                   String city,
                   String country,
                   User userAccount) {
        this.id = id;
        this.accId = accId;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.country = country;
        this.userAccount = userAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(User userAccount) {
        this.userAccount = userAccount;
    }
}
