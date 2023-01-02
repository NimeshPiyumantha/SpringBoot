package com.supermarket.out.repo;

import com.supermarket.out.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM USER WHERE ID = ?1", nativeQuery = true)
    User getUserById(String userId);

    //    @Modifying kiyna eka use krnwa update query liyddi
    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS =?2", nativeQuery = true)
    User getUserByUserIdAndAddress(String userId, String address);

}
