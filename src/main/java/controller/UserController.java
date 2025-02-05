package controller;

import ch.qos.logback.core.model.Model;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import properties.AppProperties;
import service.UserService;

import java.util.Map;

public class UserController {

    @Autowired
   private UserService userService;

    @Autowired
    private AppProperties appProperties;


    @GetMapping("/user")
    public String loadUserDetails(Model model) {
        User user = new User();
        return "userInfo";
    }
     @PostMapping("/saveUser")
    public String saveUser(User user , Model model){
         Map<String , String> message= appProperties.getMesssage();
         boolean saveUser = service.saveUser(user);
         if(saveUser) model.addAttribute("SUCCESS", message.get("saveSuccess"));
         else model.addAttribute("saveFail", message.get("savefail"));
         return "userInfo";

     }
}
