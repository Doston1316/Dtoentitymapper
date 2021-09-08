package uz.doston.dtoentitymapper.dtoMapper;

import uz.doston.dtoentitymapper.model.Address;

import java.util.List;
import java.util.stream.Collectors;

public class AddressMapper {


    public static Address toAddress(AddressDto addressDto){
        if (addressDto ==null){
            return null;
        }
        return Address.builder()
                .userAccount(UserMapper.toUser(addressDto.getUserAccount()))
                .accId(addressDto.getAccId())
                .address1(addressDto.getAddress1())
                .address2(addressDto.getAddress2())
                .address3(addressDto.getAddress3())
                .city(addressDto.getCity())
                .country(addressDto.getCountry()).build();
    }


    public static AddressDto toAddressDto(Address address){
        if (address ==null){
            return null;
        }
        return AddressDto.builder()
                .userAccount(UserMapper.toUserDto(address.getUserAccount()))
                .accId(address.getAccId())
                .address1(address.getAddress1())
                .address2(address.getAddress2())
                .address3(address.getAddress3())
                .city(address.getCity())
                .country(address.getCountry()).build();
    }

    public static Address toUpdateToAddress(Address address,Address update){
        address.setAddress1(update.getAddress1()==null? address.getAddress1() : update.getAddress1());
        address.setAddress2(update.getAddress2()==null? address.getAddress2() : update.getAddress2());
        address.setAddress3(update.getAddress3()==null? address.getAddress3() : update.getAddress3());
        address.setCity(update.getCity()==null? address.getCity() : update.getCity());
        address.setCountry(update.getCountry()==null? address.getCountry() : update.getCountry());
       return address;
    }


    public static List<Address> toAddresses(List<AddressDto>addressDtos){
        return addressDtos.stream().map(addressDto -> toAddress(addressDto)).collect(Collectors.toList());
    }


    public static List<AddressDto> toAddressesDtos(List<Address>address){
        return address.stream().map(addresses -> toAddressDto(addresses)).collect(Collectors.toList());
    }

}
