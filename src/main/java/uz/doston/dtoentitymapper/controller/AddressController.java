package uz.doston.dtoentitymapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;
import uz.doston.dtoentitymapper.dtoMapper.AddressDto;
import uz.doston.dtoentitymapper.dtoMapper.AddressMapper;
import uz.doston.dtoentitymapper.model.Address;
import uz.doston.dtoentitymapper.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @PostMapping("/address")
    public AddressDto create(@RequestBody AddressDto addressDto){
        return AddressMapper.toAddressDto(addressService.saveToUpdate(AddressMapper.toAddress(addressDto)));
    }

    @GetMapping("/address/{id}")
    public List<AddressDto>findByUserId(@PathVariable("id") Long id){
        return AddressMapper.toAddressesDtos(addressService.findByUserAccount(id));
    }


    @DeleteMapping("/address/{id}")
    public void delete(@PathVariable("id")Long id){
        addressService.deleteById(id);
    }







}
