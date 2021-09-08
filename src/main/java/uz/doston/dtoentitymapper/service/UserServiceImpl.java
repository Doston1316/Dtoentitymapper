package uz.doston.dtoentitymapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.doston.dtoentitymapper.model.User;
import uz.doston.dtoentitymapper.repository.UserRepository;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveOrUpdate(User user) {
        if (user.getId() == null){
            User userData=userRepository.getOne(user.getId());
            if (userData == null){
                return null;
            }

            userData.setLastName(user.getLastName());
            userData.setFirstName(user.getFirstName());
            userData.setJobTitle(user.getJobTitle());
            return userRepository.save(userData);
        }
        return userRepository.save(user);

    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
