package uz.doston.dtoentitymapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.doston.dtoentitymapper.model.Address;
import uz.doston.dtoentitymapper.model.User;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Long> {
        List<Address>findByUserAccount(User userAccount);
}
