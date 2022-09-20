package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.boot.model.User;


public interface UserRepository extends JpaRepository<User,Long>{

}
