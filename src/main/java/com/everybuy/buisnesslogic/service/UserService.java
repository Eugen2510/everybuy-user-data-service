package com.everybuy.buisnesslogic.service;

import com.everybuy.database.entity.Role;
import com.everybuy.database.entity.User;
import com.everybuy.database.repository.UserRepository;
import com.everybuy.routing.model.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User saveUser(UserDTO userDTO){
        return userRepository.save(getUserByUserName(userDTO.fullName()));
    }

    public User getUserById(long id){
        return userRepository.findById(id).orElseThrow();
    }
    public User getUserByUserName(String username){
        return userRepository.findUserByFullName(username).orElseThrow();
    }


    public UserDTO convertToUserDTO(User user){
        return new UserDTO(
                user.getFullName(),
                user.getEmail(),
                user.getPhone(),
                user.isBlock(),
                user.getRoles()
                        .stream()
                        .map(Role::convertToRoleDTO)
                        .collect(Collectors.toSet())
        );
    }

    public User convertToUser(UserDTO userDTO){
        return getUserByUserName(userDTO.fullName());
    }

    public List<UserDTO> getAllUsersDTO() {
        return getAllUsers()
                .stream()
                .map(this::convertToUserDTO)
                .toList();
    }
}
