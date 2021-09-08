package uz.doston.dtoentitymapper.service;

import org.springframework.stereotype.Service;
import uz.doston.dtoentitymapper.model.Address;
import uz.doston.dtoentitymapper.model.User;

import java.util.List;

public interface AddressService {

    Address saveToUpdate(Address address);

    Address findById(Long id);

    void deleteById(Long id);

    List<Address>getAll();

    List<Address> findByUserAccount(Long id);


}
