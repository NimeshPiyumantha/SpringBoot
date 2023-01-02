package com.supermarket.out.repo;

import com.supermarket.out.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true)
    User getUserById(String userId);

}
