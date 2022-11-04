package com.cydeo.mapper;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import org.modelmapper.ModelMapper;

public class UserMapper {

    private ModelMapper modelMapper;


    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public User convertToEntity(UserDTO userDTO){
       return modelMapper.map(userDTO, User.class);
    }


    public UserDTO convertToDto(User user){
        return modelMapper.map(user, UserDTO.class);
    }



}
