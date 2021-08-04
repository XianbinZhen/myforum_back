package com.zhen.myForum.repository;


import com.zhen.myForum.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepo extends CrudRepository<User, Integer> {
}
