/**
 * @author Piyush Tomar
 */

package com.java.magicPos.services;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.magicPos.Repository.UserRepository;
import com.java.magicPos.beans.User;



@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	private static final Logger logger = LogManager.getLogger(UserController.class);
	
	/**
	 * Creates a new User
	 */
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User create(@RequestBody User userObj) 
	{
		logger.info("user/create() is called and requested data is " + userObj);
		userObj.setTravelDate(new Date());
		userObj = userRepository.save(userObj);
	    return userObj;
	}
	
	
	
	
//	@PostMapping("/api")
//    public User login(@RequestBody User user) {
//
//        //logger.info("User's Object is " +  user);
//        logger.info("User's Object is " +  user + " and passenger Name is " + user.getPsngrName());
//
//        //validate login here
//
//        return user;
//       // return new ResponseEntity<T>(HttpStatus.OK);
//
//    }
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User updateStudent(@RequestBody User user) {
		user.setTravelDate(new Date());
		logger.info("saving user: "+user);
		userRepository.save(user);
		return user;
}
	
	
	/**
	 * Gets User Object by userId  
	 */
	@RequestMapping("/read")
	public User read(@RequestParam Long userId) 
	{
		User userObj = userRepository.findOne(userId);
	    return userObj;
	}
	
//	public User update(@RequestParam Long userId, @RequestParam String psngrName) {
//		User userObj = userRepository.findOne(userId);
//		//booking.setPsngrName(psngrName);
//		userObj = userRepository.save(userObj);
//	    return userObj;
//	}
	/**
	 * Updates User Object
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public User update(User userObj)
	{
		userObj = userRepository.save(userObj);
		return userObj;
	}
	
	
	/**
	 * Deletes a User Object from the database
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam Long userId) {
		userRepository.delete(userId);
	    return "booking #"+userId+" deleted successfully";
	}
	
	
	/**
	 * Authenticates a User Object 
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userAuthenticate(@RequestParam String psngrName, @RequestParam String departure) {
	//	userRepository.authenticate(psngrName, departure);
		return "true";
	}
}
