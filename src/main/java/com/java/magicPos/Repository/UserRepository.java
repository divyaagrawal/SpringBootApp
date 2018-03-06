package com.java.magicPos.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.java.magicPos.beans.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long>{
	
//	 @Query("select * from User where psngrName = :userName and departue= : password")
//	    public User authenticate(String userName,String password);

}
