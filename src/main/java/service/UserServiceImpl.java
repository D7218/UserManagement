package service;

import constant.UserConstant;
import model.User;
import org.antlr.v4.runtime.misc.LogManager;
import repository.UserRepo;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Override
    public boolean saveUser(User user) {
        user.setIsActive(UserConstant.isActiveTrue);
        User newUser = userRepo.save(user);
        if(newUser !=null && newUser.getUserId()!= null){
            return true;
        }
        return false;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUser(Integer userId) {
        return null;
    }

    @Override
    public boolean deleteUser(Integer userId) {
        return false;
    }
}
