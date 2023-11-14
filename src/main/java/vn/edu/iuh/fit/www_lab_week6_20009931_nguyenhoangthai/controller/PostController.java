package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.dao.PostDao;

@Controller
public class PostController {
    private PostDao postDao;
    @Autowired
    public PostController(PostDao postDao ){this.postDao = postDao;}

    @GetMapping("/postList/{userId}")
    public String showListPost(@PathVariable long  userId, Model model) {
        model.addAttribute("userId", userId);
        return "addPost";
    }

}
