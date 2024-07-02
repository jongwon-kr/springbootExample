package com.exampleSpringboot.example.StepB.service;

import com.exampleSpringboot.example.StepB.dto.UserDTO;

import java.util.List;

/**
 * UserService는 사용자 관련 비즈니스 로직을 정의합니다.
 */
public interface UserService {
    void createUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    void updateUser(UserDTO userDTO);
    void deleteUser(Long id);
}