package com.example.dao;

import com.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mehmet on 9.10.2016.
 */


@Repository
public interface UserDao extends CrudRepository<User,Long> {
}
