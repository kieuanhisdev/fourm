package vn.id.kieuanhdev.fourm.service;

import vn.id.kieuanhdev.fourm.dto.UserDTO;
import vn.id.kieuanhdev.fourm.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDto);

    User findUserByEmail(String email);

    List<UserDTO> findAllUsers();
}
