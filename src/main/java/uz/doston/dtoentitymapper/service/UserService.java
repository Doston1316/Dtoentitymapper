package uz.doston.dtoentitymapper.service;

import org.springframework.stereotype.Service;
import uz.doston.dtoentitymapper.model.User;

import java.util.List;

public interface UserService {


    User saveOrUpdate(User user);

    User findById(Long id);

    void deleteById(Long id);

    List<User>getAll();
}
