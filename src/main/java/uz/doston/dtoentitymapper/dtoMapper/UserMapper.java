package uz.doston.dtoentitymapper.dtoMapper;

import uz.doston.dtoentitymapper.model.User;


public class UserMapper {


    public static User toUser(UserDto userDto){
        if (userDto ==null){
            return null;
        }
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .jobTitle(userDto.getJobTitle()).build();
    }


    public static UserDto toUserDto(User user){
        if (user ==null){
            return null;
        }
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .jobTitle(user.getJobTitle()).build();
    }


    public static User toUpdateToUser(User user, User update){
        user.setJobTitle(update.getJobTitle()==null? update.getJobTitle() : update.getJobTitle());
        user.setFirstName(update.getFirstName()==null? update.getFirstName() : update.getFirstName());
        user.setLastName(update.getLastName()==null? update.getLastName() : update.getLastName());
        return user;
    }



}
