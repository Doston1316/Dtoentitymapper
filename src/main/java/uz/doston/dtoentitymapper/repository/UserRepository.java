package uz.doston.dtoentitymapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.doston.dtoentitymapper.model.User;

public interface UserRepository extends JpaRepository<User,Long> {


}
