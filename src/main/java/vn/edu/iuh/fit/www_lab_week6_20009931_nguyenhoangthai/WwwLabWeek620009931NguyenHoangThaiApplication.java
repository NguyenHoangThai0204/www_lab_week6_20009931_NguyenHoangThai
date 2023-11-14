package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.dao.UserDao;

@SpringBootApplication
public class WwwLabWeek620009931NguyenHoangThaiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WwwLabWeek620009931NguyenHoangThaiApplication.class, args);
        UserDao userDao = context.getBean(UserDao.class);
    }

}
