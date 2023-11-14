package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.entity.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    private final EntityManager manager;
    @Autowired
    public UserDao(EntityManager entityManagermanager) {
        this.manager = entityManagermanager;
    }
    @Transactional
    public boolean addUser(User user ){
        user.setRegisteredAt(LocalDateTime.now());
        user.setLastLogin(LocalDateTime.now());
        user.setProfile("This is my blog");
        user.setIntro("Hello anyone! Im newbie");
        manager.persist(user);
        return true;
    }
    @Transactional
    public boolean login(String sdt, String pass){
        List<String> mobiles=new ArrayList<>();
        String sql ="select mobile from user";
        if (manager.createNativeQuery(sql, String.class).getResultList().isEmpty())
            return false;
        String sql2 = "select * from user where mobile=?";
        Query query = manager.createNativeQuery(sql2, User.class);
        query.setParameter(1, sdt);
        User user= (User) query.getSingleResult();
        if( user != null && user.getPassword().equalsIgnoreCase(pass)){
            user.setLastLogin(LocalDateTime.now());
            manager.merge(user);
            return true;
        }
        return false;
    }
    public User getUserByMobile(String mobile){
        User user=new User();
        try {
            String sql="SELECT * FROM user\n" +
                    "WHERE Mobile=?";
            Query query = manager.createNativeQuery(sql, User.class);
            query.setParameter(1, mobile);
            user= (User) query.getSingleResult();
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
