package service;

import model.User;

import java.util.List;

public interface UserService {
    public boolean saveUser(User user);
    public List<User> getAllUser();
    public User getUser(Integer userId);
    public boolean deleteUser(Integer userId);
}
