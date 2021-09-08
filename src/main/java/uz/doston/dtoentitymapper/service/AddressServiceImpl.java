package uz.doston.dtoentitymapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.doston.dtoentitymapper.dtoMapper.AddressMapper;
import uz.doston.dtoentitymapper.model.Address;
import uz.doston.dtoentitymapper.model.User;
import uz.doston.dtoentitymapper.repository.AddressRepository;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private UserService userService;

    @Override
    public Address saveToUpdate(Address address) {
        if (address.getId() != null){
            Address addressDate=addressRepository.getOne(address.getId());

            addressDate= AddressMapper.toUpdateToAddress(addressDate,address);
            if (address.getAccId() !=null){
                User user=userService.findById(address.getAccId());
                address.setUserAccount(user);
            }
            return addressRepository.save(addressDate);
        }

        if (address.getAccId() !=null){
            User user=userService.findById(address.getAccId());
            address.setUserAccount(user);
        }
        return addressRepository.save(address);

    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
    addressRepository.deleteById(id);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public List<Address> findByUserAccount(Long id) {
        User user=userService.findById(id);
        return addressRepository.findByUserAccount(user);
    }
}
