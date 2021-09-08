package uz.doston.dtoentitymapper.model;

import jdk.jshell.Snippet;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    @Column(name = "jobTitle")
    private String jobTitle;
    @Column(name = "addresses")
    @OneToMany(mappedBy = "userAccount",cascade = CascadeType.ALL)
    private List<Address>addresses;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String jobTitle, List<Address> addresses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.addresses = addresses;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
