package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDao {
    private final EntityManager manager;
    @Autowired
    public PostDao(EntityManager manager) {
        this.manager = manager;
    }


}
