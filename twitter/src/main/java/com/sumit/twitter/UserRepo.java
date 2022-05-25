package com.sumit.twitter;

//package com.telusko.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sumit.twitter.User;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Integer>
{

}