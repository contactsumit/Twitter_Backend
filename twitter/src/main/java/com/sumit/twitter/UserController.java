package com.sumit.twitter;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sumit.twitter.UserRepo;
import com.sumit.twitter.User;

@RestController
public class UserController {
{
	@Autowired
	UserRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@PostMapping(path="/user",consumes= {"application/json"})
	public User addAlien(@RequestBody User user)
	{
		repo.save(user);
		return user;
	}
	@GetMapping(path="/users")
	public List<User> getUsers()
	{
		return repo.findAll();
		
		
	}
	@RequestMapping("/user/{aid}")
	public Optional<User> getUser(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}
}