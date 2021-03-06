package uz.doston.dtoentitymapper.dtoMapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import uz.doston.dtoentitymapper.model.User;

import javax.persistence.Transient;
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {

    private Long id;
    @Transient
    private Long accId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String country;
    private UserDto userAccount;

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

    public UserDto getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserDto userAccount) {
        this.userAccount = userAccount;
    }
}
