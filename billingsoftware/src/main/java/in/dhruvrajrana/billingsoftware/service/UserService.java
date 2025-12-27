package in.dhruvrajrana.billingsoftware.service;

import in.dhruvrajrana.billingsoftware.io.UserRequest;
import in.dhruvrajrana.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
