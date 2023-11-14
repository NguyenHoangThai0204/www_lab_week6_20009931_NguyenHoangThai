package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.convert.UserInfor;
import vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.dao.UserDao;
import vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.entity.User;

@Controller
public class UserController {
    private UserDao userDao;
    public UserController(UserDao userDao ){this.userDao = userDao;}
    @GetMapping("/")
    public String showHome(){return "index";}
    @GetMapping("/login")
    public String showLogin(){return "login";}

    @PostMapping("/login")
    public String processLogin(@RequestParam String uname, @RequestParam String upass, Model model){
        if(userDao.login(uname, upass)){
            return "postList" ;
        }
        else{
            model.addAttribute("erorr", "Thông tin không đúng");
            return "login";
        }
    }
    @GetMapping("/register")
    public String showRegister(){return "register";}

    @PostMapping("/register")
    public String register(@ModelAttribute UserInfor infor){
        userDao.addUser(new User(infor.getUfname(), infor.getUlname(), infor.getUmname(), infor.getUsdt(), infor.getUmail(), infor.getUpass()));
        return "index";
    }
}
